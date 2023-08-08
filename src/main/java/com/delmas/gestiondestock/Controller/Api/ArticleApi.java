package com.delmas.gestiondestock.Controller.Api;

import com.delmas.gestiondestock.dto.ArticleDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.delmas.gestiondestock.Utils.Contants.APP_ROOT;

public interface ArticleApi {

    @PostMapping(value = APP_ROOT+"/article/create", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto save(@RequestBody ArticleDto dto);

    @GetMapping(value = APP_ROOT+"/article/{idArticle}",produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto findById(@PathVariable("idArticle") Integer id);

    @GetMapping(value = APP_ROOT+"/article/{codeArticle}",produces = MediaType.APPLICATION_JSON_VALUE)
    ArticleDto findByCodeArticle(@PathVariable("codeArticle")String codeArticle);

    @GetMapping(value = APP_ROOT+"/article/all",produces = MediaType.APPLICATION_JSON_VALUE)
    List<ArticleDto> findAll();

    @DeleteMapping(value = APP_ROOT+"/article/delete/{idArticle}")
    Void delete(@PathVariable("idArticle") Integer id);
}