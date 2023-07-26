package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.Adresse;
import com.delmas.gestiondestock.Model.Client;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ClientDto {

    private Integer id;

    private String nom;

    private  String prenom;

    private String email;

    private AdresseDto adresse;

    private String photo;

    private String numTel;

    private List<CommandeClientDto> commandeClients;

    public static ClientDto fromEntity(Client client){
        if(client == null){
            return null;
        }

        return  ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .email(client.getEmail())
                .photo(client.getPhoto())
                .numTel(client.getNumTel())
                .build();
    }

    public static Client toEntity(ClientDto clientDto){
        if(clientDto == null){
            return null;
        }

        return  Client.builder()
                .nom(clientDto.getNom())
                .prenom(clientDto.getPrenom())
                .email(clientDto.getEmail())
                .photo(clientDto.getPhoto())
                .numTel(clientDto.getNumTel())
                .build();
    }
}
