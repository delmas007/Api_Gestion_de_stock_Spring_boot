package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.Adresse;
import com.delmas.gestiondestock.Model.Entreprise;
import com.delmas.gestiondestock.Model.Roles;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UtilisateurDto {
    private String nom;

    private String prenom;

    private String email;

    private AdresseDto adresse;

    private String motDePasse;

    private EntrepriseDto entreprise;

    private List<RolesDto> roles;
}
