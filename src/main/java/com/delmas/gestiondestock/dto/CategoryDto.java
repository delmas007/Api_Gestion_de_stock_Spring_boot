package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CategoryDto {

    private Integer id;

    private  String code;

    private  String designation;

    @JsonIgnore
    private List<ArticleDto> articles;

    public CategoryDto fromEntity(Category category){
        if(category == null){
            return null;
//         TODO throw an exception
        }
//      Category => CategoryDto
        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();

    }

    public Category toEntity(CategoryDto categoryDto){
        if(categoryDto == null){
            return null;
//         TODO throw an exception
        }
//        CategoryDto => Category
        return Category.builder()
                .code(categoryDto.getCode())
                .designation(categoryDto.getDesignation())
                .build();

    }
}
