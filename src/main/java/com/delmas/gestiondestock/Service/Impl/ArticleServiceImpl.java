package com.delmas.gestiondestock.Service.Impl;

import com.delmas.gestiondestock.Exception.EntityNotFoundException;
import com.delmas.gestiondestock.Exception.ErrorCodes;
import com.delmas.gestiondestock.Exception.InvalidEntityException;
import com.delmas.gestiondestock.Model.Article;
import com.delmas.gestiondestock.Repository.ArticleRepository;
import com.delmas.gestiondestock.Service.ArticleService;
import com.delmas.gestiondestock.dto.ArticleDto;
import com.delmas.gestiondestock.validator.ArticleValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {

    private ArticleRepository articleRepository;

//    Injection de type constructeur
    @Autowired
    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public ArticleDto save(ArticleDto dto) {
        List<String> errors = ArticleValidator.validate(dto);
        if(!errors.isEmpty()){
            log.error("Article is not valid {}",dto);
            throw new InvalidEntityException("l'article n'est pas valide", ErrorCodes.ARTICLE_NOT_VALID,errors);
        }
          return ArticleDto.fromEntity(articleRepository.save(ArticleDto.toEntity(dto)));
    }

    @Override
    public ArticleDto findById(Integer id) {
        if (id == null){
            log.error("Article ID is null");
        }
        Optional<Article> article = articleRepository.findById(id);
        return Optional.of(ArticleDto.fromEntity(article.get())).orElseThrow(() ->
                new EntityNotFoundException(
                        "Aucun artiste avec l'ID = "+id+"n'a ete trouver dans la bd",
                        ErrorCodes.ARTICLE_NOT_FOUND
                )
        );
    }

    @Override
    public ArticleDto findByCodeArticle(String codeArticle) {
        if (!StringUtils.hasLength(codeArticle)){
            log.error("Article CODE is null");
        }
        Optional<Article> article = articleRepository.findArticleByCodeArticle(codeArticle);
        return Optional.of(ArticleDto.fromEntity(article.get())).orElseThrow(() ->
                new EntityNotFoundException(
                        "Aucun artiste avec le CODE = "+codeArticle+"n'a ete trouver dans la bd",
                        ErrorCodes.ARTICLE_NOT_FOUND
                )
        );
    }

    @Override
    public List<ArticleDto> findAll() {
        return articleRepository.findAll().stream().map(ArticleDto::fromEntity).collect(Collectors.toList());
    }

    @Override
    public Void delete(Integer id) {
        if (id == null){
            log.error("Article ID is null");
        }
        articleRepository.deleteById(id);
        return null;
    }
}
