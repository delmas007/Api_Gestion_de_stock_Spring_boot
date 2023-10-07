package com.delmas.gestiondestock.Repository;

import com.delmas.gestiondestock.Model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Integer>{

    Optional<Article> findArticleByCodeArticle(String codeArticle);


    List<Article> findAllByCategoryId(Integer id);

//      Effectuer du code Sql
//    @Query("SELECT codeArticle FROM Article WHERE codeArticle = :code")
//    List<Article> findByCustom(String code);

}
