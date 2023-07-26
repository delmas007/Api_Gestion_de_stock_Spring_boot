package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.Article;
import com.delmas.gestiondestock.Model.Entreprise;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EntrepriseDto {

    private Integer id;

    private String nom;

    private AdresseDto adresse;

    private String photo;

    private String email;

    private String numTel;

    private String description;

    private String steWeb;

    private List<UtilisateurDto> utilisateur;

    public static EntrepriseDto fromEntity(Entreprise entreprise){
        if(entreprise == null){
            return null;
        }

        return  EntrepriseDto.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .photo(entreprise.getPhoto())
                .email(entreprise.getEmail())
                .numTel(entreprise.getNumTel())
                .description(entreprise.getDescription())
                .steWeb(entreprise.getSteWeb())
                .build();
    }

    public static Entreprise toEntity(EntrepriseDto entrepriseDto){
        if(entrepriseDto == null){
            return null;
        }

        return  Entreprise.builder()
                .nom(entrepriseDto.getNom())
                .photo(entrepriseDto.getPhoto())
                .email(entrepriseDto.getEmail())
                .numTel(entrepriseDto.getNumTel())
                .description(entrepriseDto.getDescription())
                .steWeb(entrepriseDto.getSteWeb())
                .build();
    }
}
