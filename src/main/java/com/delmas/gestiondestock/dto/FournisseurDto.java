package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.Adresse;
import com.delmas.gestiondestock.Model.CommandeFournisseur;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class FournisseurDto {

    private String nom;

    private  String prenom;

    private String email;

    private AdresseDto adresse;

    private String photo;

    private String numTel;

    private List<CommandeFournisseurDto> commandeFournisseurs;
}
