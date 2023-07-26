package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.Article;
import com.delmas.gestiondestock.Model.LigneVente;
import com.delmas.gestiondestock.Model.MvtStk;
import com.delmas.gestiondestock.Model.TypeMvtStk;
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

    private ArticleDto article;

    private TypeMvtStk typeMvtStk;

    public static MvtStkDto fromEntity(MvtStk mvtStk){
        if(mvtStk == null){
            return null;
        }

        return  MvtStkDto.builder()
                .id(mvtStk.getId())
                .quantite(mvtStk.getQuantite())
                .dateMvt(mvtStk.getDateMvt())
                .typeMvtStk(mvtStk.getTypeMvtStk())
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
                .build();
    }
}
