package com.delmas.gestiondestock.dto;

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
}
