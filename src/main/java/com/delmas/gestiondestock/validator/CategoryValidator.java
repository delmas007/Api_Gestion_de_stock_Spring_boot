package com.delmas.gestiondestock.validator;

import com.delmas.gestiondestock.dto.CategoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategoryValidator {
    public static List<String> validate(CategoryDto categoryDto){
        List<String> errors = new ArrayList<>();
        if( categoryDto.getCode()== null || !StringUtils.hasLength(categoryDto.getCode())){
            errors.add("Veillez renseigner le code de la categorie");
        }
        return errors;
    }
}
