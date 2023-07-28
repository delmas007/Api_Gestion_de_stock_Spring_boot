package com.delmas.gestiondestock.validator;

import com.delmas.gestiondestock.dto.ArticleDto;
import com.delmas.gestiondestock.dto.CategoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {
    public static List<String> validate(ArticleDto articleDto){
        List<String> errors = new ArrayList<>();

        if(articleDto == null){
            errors.add("Veillez renseigner le code d'article");
            errors.add("Veillez renseigner la designation de l'article");
            errors.add("Veillez renseigner le prix unitaire HT d'article");
            errors.add("Veillez renseigner le taux TVA de l'article");
            errors.add("Veillez renseigner le prix TTC de l'article");
            errors.add("Veillez selectionner une categorie");

            return errors;

        }

        if(!StringUtils.hasLength(articleDto.getCodeArticle())){
            errors.add("Veillez renseigner le code d'article");
        }
        if(!StringUtils.hasLength(articleDto.getDesignation())){
            errors.add("Veillez renseigner la designation de l'article");
        }
        if(articleDto.getPrixUnitaireHt() == null){
            errors.add("Veillez renseigner le prix unitaire HT d'article");
        }
        if(articleDto.getTauxTva() == null){
            errors.add("Veillez renseigner le taux TVA de l'article");
        }
        if(articleDto.getPrixUnitaireTtc() == null){
            errors.add("Veillez renseigner le prix TTC de l'article");
        }
        if(articleDto.getCategory() == null){
            errors.add("Veillez selectionner une categorie");
        }

        return errors;
    }
}
