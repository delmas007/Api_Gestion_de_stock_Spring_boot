package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.Adresse;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClientDto {

    private String nom;

    private  String prenom;

    private String email;

    private AdresseDto adresse;

    private String photo;

    private String numTel;

    private List<CommandeClientDto> commandeClients;
}
