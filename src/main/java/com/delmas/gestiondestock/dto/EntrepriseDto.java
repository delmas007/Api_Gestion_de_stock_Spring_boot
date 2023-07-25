package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.Adresse;
import com.delmas.gestiondestock.Model.Utilisateur;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EntrepriseDto {

    private String nom;

    private AdresseDto adresse;

    private String photo;

    private String email;

    private String numTel;

    private String description;

    private String steWeb;

    private List<UtilisateurDto> utilisateur;
}
