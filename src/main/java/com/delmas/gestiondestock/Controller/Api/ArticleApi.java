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
            @ApiResponse(code = 200,message = "L'objet article cree/modifier"),
            @ApiResponse(code = 400,message = "L'objet article n'est pas valide")
    })
    ArticleDto save(@RequestBody ArticleDto dto);

    @GetMapping(value = APP_ROOT+"/article/{idArticle}",produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Rechercher un article par ID",notes = "Cette methode permet de chercher un article par son ID ",response = ArticleDto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "L'article a ete trouve dans la BDD"),
            @ApiResponse(code = 404,message = "Aucun article n'existe dans la BDD avec l'ID fourni")
    })
    ArticleDto findById(@PathVariable("idArticle") Integer id);

    @GetMapping(value = APP_ROOT+"/article/{codeArticle}",produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Rechercher un article par CODE",notes = "Cette methode permet de chercher un article par son CODE ",response = ArticleDto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "L'article a ete trouve dans la BDD"),
            @ApiResponse(code = 404,message = "Aucun article n'existe dans la BDD avec le CODE fourni")
    })
    ArticleDto findByCodeArticle(@PathVariable("codeArticle")String codeArticle);

    @GetMapping(value = APP_ROOT+"/article/all",produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Renvoie la liste des articles",notes = "Cette methode permet de renvoyer la liste des articles qui existent" +
            "dans la BDD ",response = ArticleDto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "la liste des articles / une liste vide")
    })
    List<ArticleDto> findAll();

    @DeleteMapping(value = APP_ROOT+"/article/delete/{idArticle}")
    @ApiOperation(value = "Supprimer un article",notes = "Cette methode permet de supprimer un article par ID" +
            "dans la BDD ",response = ArticleDto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200,message = "l'article a ete trouver dans la BDD")
    })
    Void delete(@PathVariable("idArticle") Integer id);

}
