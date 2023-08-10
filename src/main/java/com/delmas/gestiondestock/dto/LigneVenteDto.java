package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.LigneVente;
import com.fasterxml.jackson.annotation.JacksonInject;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {
    private Integer id;

    private VentesDto ventes;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    private Integer idEntreprise;

    private ArticleDto article;

    public static LigneVenteDto fromEntity(LigneVente ligneVente){
        if(ligneVente == null){
            return null;
        }

        return  LigneVenteDto.builder()
                .id(ligneVente.getId())
                .quantite(ligneVente.getQuantite())
                .prixUnitaire(ligneVente.getPrixUnitaire())
                .ventes(VentesDto.fromEntity(ligneVente.getVentes()))
                .article(ArticleDto.fromEntity(ligneVente.getArticle()))
                .idEntreprise(ligneVente.getIdEntreprise())
                .build();
    }

    public static LigneVente toEntity(LigneVenteDto ligneVenteDto){
        if(ligneVenteDto == null){
            return null;
        }

        return  LigneVente.builder()
                .quantite(ligneVenteDto.getQuantite())
                .prixUnitaire(ligneVenteDto.getPrixUnitaire())
                .ventes(VentesDto.toEntity(ligneVenteDto.getVentes()))
                .article(ArticleDto.toEntity(ligneVenteDto.getArticle()))
                .idEntreprise(ligneVenteDto.getIdEntreprise())
                .build();
    }

}
