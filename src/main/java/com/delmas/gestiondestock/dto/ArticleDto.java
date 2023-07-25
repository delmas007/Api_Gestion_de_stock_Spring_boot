package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.Category;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {

    private String codeArticle;

    private  String designation;

    private BigDecimal prixUnitaireHt;

    private BigDecimal prixUnitaireTtc;

    private BigDecimal tauxTva;

    private String photo;

    private CategoryDto category;
}
