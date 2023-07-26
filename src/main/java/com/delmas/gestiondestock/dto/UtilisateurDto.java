package com.delmas.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UtilisateurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private String email;

    private AdresseDto adresse;

    private String motDePasse;

    private EntrepriseDto entreprise;

    private List<RolesDto> roles;
}
