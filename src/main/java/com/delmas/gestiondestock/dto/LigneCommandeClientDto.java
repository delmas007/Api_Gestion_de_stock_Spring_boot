package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.Article;
import com.delmas.gestiondestock.Model.CommandeClient;
import com.delmas.gestiondestock.Model.Fournisseur;
import com.delmas.gestiondestock.Model.LigneCommandeClient;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeClientDto {

    private Integer id;

    private ArticleDto article;

    private CommandeClientDto commandeClient;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

    public static LigneCommandeClientDto fromEntity(LigneCommandeClient ligneCommandeClient){
        if(ligneCommandeClient == null){
            return null;
        }

        return  LigneCommandeClientDto.builder()
                .id(ligneCommandeClient.getId())
                .quantite(ligneCommandeClient.getQuantite())
                .prixUnitaire(ligneCommandeClient.getPrixUnitaire())
                .commandeClient(CommandeClientDto.fromEntity(ligneCommandeClient.getCommandeClient()))
                .build();
    }

    public static LigneCommandeClient toEntity(LigneCommandeClientDto ligneCommandeClientDto){
        if(ligneCommandeClientDto == null){
            return null;
        }

        return  LigneCommandeClient.builder()
                .quantite(ligneCommandeClientDto.getQuantite())
                .prixUnitaire(ligneCommandeClientDto.getPrixUnitaire())
                .commandeClient(CommandeClientDto.toEntity(ligneCommandeClientDto.getCommandeClient()))
                .build();
    }
}
