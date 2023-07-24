package com.delmas.gestiondestock.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ligneVente")
public class LigneVente extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "idVente")
    private  Ventes ventes;

    private BigDecimal quantite;
}
