package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.Client;
import com.delmas.gestiondestock.Model.CommandeClient;
import com.delmas.gestiondestock.Model.LigneCommandeClient;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeClientDto {

    private Integer id;

    private String code;

    private Instant DateCommande;

    private ClientDto client;

    private List<LigneCommandeClientDto> ligneCommandeClients;

    public static CommandeClientDto fromEntity(CommandeClient commandeClient){
        if(commandeClient == null){
            return null;
        }

        return  CommandeClientDto.builder()
                .id(commandeClient.getId())
                .code(commandeClient.getCode())
                .DateCommande(commandeClient.getDateCommande())
//                .client(commandeClient.getClient())
                .build();
    }

    public static CommandeClient toEntity(CommandeClientDto commandeClientDto){
        if(commandeClientDto == null){
            return null;
        }

        return  CommandeClient.builder()
                .code(commandeClientDto.getCode())
                .DateCommande(commandeClientDto.getDateCommande())
//                .client(commandeClient.getClient())
                .build();
    }
}
