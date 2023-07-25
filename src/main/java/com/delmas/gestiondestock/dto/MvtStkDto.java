package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.Article;
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

    private Instant dataMvt;

    private BigDecimal quantite;

    private ArticleDto article;

    private TypeMvtStk typeMvtStk;
}
