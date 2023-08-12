package com.delmas.gestiondestock.Model;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
//
//@EqualsAndHashCode(callSuper = true)
//@Data
//@Builder
//@Entity
//@NoArgsConstructor
//@AllArgsConstructor
//@Table(name = "LigneCommandeFournisseur")
//public class LigneCommandeFournisseur extends AbstractEntity {
//
//    @ManyToOne
//    @JoinColumn(name = "idArticle")
//    private  Article article;
//
//    @ManyToOne
//    @JoinColumn(name = "idCommandeFournisseur")
//    private CommandeFournisseur commandeFournisseur;
//
//    @Column(name = "quantite")
//    private BigDecimal quantite;
//
//    @Column(name = "prixUnitaire")
//    private BigDecimal prixUnitaire;
//
//    @Column(name = "idEntreprise")
//    private  Integer idEntreprise;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Builder
@Table(name = "lignecommandefournisseur")
public class LigneCommandeFournisseur extends AbstractEntity {

    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "idcommandefournisseur")
    private CommandeFournisseur commandeFournisseur;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixunitaire")
    private BigDecimal prixUnitaire;

    @Column(name = "identreprise")
    private Integer idEntreprise;

}



