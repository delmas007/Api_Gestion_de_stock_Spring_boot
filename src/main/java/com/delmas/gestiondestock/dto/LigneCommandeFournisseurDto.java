package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeFournisseurDto {

    private Integer id;

    private ArticleDto article;

    private CommandeFournisseurDto commandeFournisseurs;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    public static LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur){
        if(ligneCommandeFournisseur == null){
            return null;
        }

        return  LigneCommandeFournisseurDto.builder()
                .id(ligneCommandeFournisseur.getId())
                .quantite(ligneCommandeFournisseur.getQuantite())
                .prixUnitaire(ligneCommandeFournisseur.getPrixUnitaire())
                .commandeFournisseurs(CommandeFournisseurDto.fromEntity(ligneCommandeFournisseur.getCommandeFournisseurs()))
                .build();
    }
    public static LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto ligneCommandeFournisseurDto){
        if(ligneCommandeFournisseurDto == null){
            return null;
        }

        return  LigneCommandeFournisseur.builder()
                .quantite(ligneCommandeFournisseurDto.getQuantite())
                .prixUnitaire(ligneCommandeFournisseurDto.getPrixUnitaire())
                .commandeFournisseurs(CommandeFournisseurDto.toEntity(ligneCommandeFournisseurDto.getCommandeFournisseurs()))
                .build();
    }
}
