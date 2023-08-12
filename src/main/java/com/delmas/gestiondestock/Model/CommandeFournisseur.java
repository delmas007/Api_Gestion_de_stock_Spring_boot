package com.delmas.gestiondestock.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.List;
//
//@EqualsAndHashCode(callSuper = true)
//@Data
//@Builder
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "CommandeFournisseur")
//public class CommandeFournisseur extends AbstractEntity{
//    @Column(name = "code")
//    private String code;
//
//    @Column(name = "dateCommande")
//    private Instant dateCommande;
//
//    @Column(name = "etatcommande")
//    @Enumerated(EnumType.STRING)
//    private EtatCommande etatCommande;
//
//    @ManyToOne
//    @JoinColumn(name = "idFournisseur")
//    private Fournisseur fournisseur;
//
//    @OneToMany(mappedBy = "CommandeFournisseur")
//    private List<LigneCommandeFournisseur> ligneCommandeFournisseur;
//
//    @Column(name = "idEntreprise")
//    private  Integer idEntreprise;
//x
//}
//

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Builder
@Table(name = "commandefournisseur")
public class CommandeFournisseur extends AbstractEntity {

    @Column(name = "code")
    private String code;

    @Column(name = "datecommande")
    private Instant dateCommande;

    @Column(name = "etatcommande")
    @Enumerated(EnumType.STRING)
    private EtatCommande etatCommande;

    @Column(name = "identreprise")
    private Integer idEntreprise;

    @ManyToOne
    @JoinColumn(name = "idfournisseur")
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs;


}
