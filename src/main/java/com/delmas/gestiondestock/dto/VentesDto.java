package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.Utilisateur;
import com.delmas.gestiondestock.Model.Ventes;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class VentesDto {

    private Integer id;

    private String code;

    private Instant dateVente;

    private String commentaire;

    private List<LigneVenteDto> ligneVentes;
    private Integer idEntreprise;

    public static VentesDto fromEntity(Ventes ventes){
        if(ventes == null){
            return null;
        }

        return  VentesDto.builder()
                .id(ventes.getId())
                .code(ventes.getCode())
                .dateVente(ventes.getDateVente())
                .commentaire(ventes.getCommentaire())
                .build();
    }
    public static Ventes toEntity(VentesDto ventesDto){
        if(ventesDto == null){
            return null;
        }

        return  Ventes.builder()
                .code(ventesDto.getCode())
                .dateVente(ventesDto.getDateVente())
                .commentaire(ventesDto.getCommentaire())
                .build();
    }


}
