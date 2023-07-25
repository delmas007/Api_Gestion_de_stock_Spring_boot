package com.delmas.gestiondestock.Model;


import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "commandeclient")
public class CommandeClient extends AbstractEntity{

    @Column(name = "code")
    private  String code;

    @Column(name = "DateCommande")
    private Instant DateCommande;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private  Client client;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients;
}
