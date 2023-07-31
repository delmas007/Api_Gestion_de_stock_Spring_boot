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
@Table(name = "ligneVente")
public class LigneVente extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "idVente")
    private  Ventes ventes;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixUnitaire")
    private BigDecimal prixUnitaire;

    @Column(name = "idEntreprise")
    private  Integer idEntreprise;
}
