package com.delmas.gestiondestock.Model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "client")
public class Client extends AbstractEntity{

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private  String prenom;

    @Column(name = "email")
    private String email;

    @Embedded
    private Adresse adresse;

    @Column(name = "photo")
    private String photo;

    @Column(name = "numTel")
    private String numTel;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;
}
