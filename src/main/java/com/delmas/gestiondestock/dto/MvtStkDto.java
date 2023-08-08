package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.*;
import jakarta.persistence.AssociationOverride;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStkDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private Integer idEntreprise;

    private ArticleDto article;

    private TypeMvtStk typeMvtStk;

    private  SourceMvtStk sourceMvtStk;

    public static MvtStkDto fromEntity(MvtStk mvtStk){
        if(mvtStk == null){
            return null;
        }

        return  MvtStkDto.builder()
                .id(mvtStk.getId())
                .quantite(mvtStk.getQuantite())
                .dateMvt(mvtStk.getDateMvt())
                .typeMvtStk(mvtStk.getTypeMvtStk())
                .sourceMvtStk(mvtStk.getSourceMvtStk())
                .article(ArticleDto.fromEntity(mvtStk.getArticle()))
                .idEntreprise(mvtStk.getIdEntreprise())
                .build();
    }
    public static MvtStk toEntity(MvtStkDto mvtStkDto){
        if(mvtStkDto == null){
            return null;
        }

        return  MvtStk.builder()
                .quantite(mvtStkDto.getQuantite())
                .dateMvt(mvtStkDto.getDateMvt())
                .typeMvtStk(mvtStkDto.getTypeMvtStk())
                .article(ArticleDto.toEntity(mvtStkDto.getArticle()))
                .sourceMvtStk(mvtStkDto.getSourceMvtStk())
                .idEntreprise(mvtStkDto.getIdEntreprise())
                .build();
    }


}
