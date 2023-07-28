package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.Fournisseur;
import com.delmas.gestiondestock.Model.Utilisateur;
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

    private String dateDeNaissance;

    private AdresseDto adresse;

    private String motDePasse;

    private EntrepriseDto entreprise;

    private List<RolesDto> roles;

    public static UtilisateurDto fromEntity(Utilisateur utilisateur){
        if(utilisateur == null){
            return null;
        }

        return  UtilisateurDto.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .motDePasse(utilisateur.getMotDePasse())
                .email(utilisateur.getEmail())
                .dateDeNaissance(utilisateur.getDateDeNaissance())
                .build();
    }
    public static Utilisateur toEntity(UtilisateurDto utilisateurDto){
        if(utilisateurDto == null){
            return null;
        }

        return  Utilisateur.builder()
                .nom(utilisateurDto.getNom())
                .prenom(utilisateurDto.getPrenom())
                .motDePasse(utilisateurDto.getMotDePasse())
                .email(utilisateurDto.getEmail())
                .dateDeNaissance(utilisateurDto.getDateDeNaissance())
                .build();
    }
}
