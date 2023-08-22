package com.delmas.gestiondestock.Controller.Api;

import com.delmas.gestiondestock.dto.ArticleDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.delmas.gestiondestock.Utils.Contants.APP_ROOT;

@Api(APP_ROOT+"/article")
public interface ArticleApi {

    @PostMapping(value = APP_ROOT+"/article/create", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Enregistrer un article",notes = "Cette methode permet d'enregistrer ou modifier un ",response = ArticleDto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "L'objet article cree/modifier")
    })
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
