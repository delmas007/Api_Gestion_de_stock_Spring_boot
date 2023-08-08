package com.delmas.gestiondestock.Controller;

import com.delmas.gestiondestock.Controller.Api.ArticleApi;
import com.delmas.gestiondestock.Service.ArticleService;
import com.delmas.gestiondestock.dto.ArticleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController implements ArticleApi {
// trois types injections
//    field,constructeur,Getter
    private ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @Override
    public ArticleDto save(ArticleDto dto) {
        return articleService.save(dto);
    }

    @Override
    public ArticleDto findById(Integer id) {
        return articleService.findById(id);
    }

    @Override
    public ArticleDto findByCodeArticle(String codeArticle) {
        return articleService.findByCodeArticle(codeArticle);
    }

    @Override
    public List<ArticleDto> findAll() {
        return articleService.findAll();
    }

    @Override
    public Void delete(Integer id) {
        articleService.delete(id);
        return null;
    }
}
