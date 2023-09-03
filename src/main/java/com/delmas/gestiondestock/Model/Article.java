package com.delmas.gestiondestock.Model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "article")
public class Article extends AbstractEntity{

    @Column(name = "codeArticle")
    private String codeArticle;

    @Column(name = "designation")
    private  String designation;

    @Column(name = "idEntreprise")
    private  Integer idEntreprise;

    @Column(name = "prixUnitaireHt")
    private BigDecimal prixUnitaireHt;

    @Column(name = "prixUnitaireTtc")
    private BigDecimal prixUnitaireTtc;

    @Column(name = "tauxTva")
    private BigDecimal tauxTva;

    @Column(name = "photo")
    private String photo;


    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;

}
