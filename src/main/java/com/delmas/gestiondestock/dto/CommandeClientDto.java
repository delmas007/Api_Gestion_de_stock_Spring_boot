package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.Client;
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

    private  String code;

    private Instant DateCommande;

    private ClientDto client;

    private List<LigneCommandeClientDto> ligneCommandeClients;
}
