package com.delmas.gestiondestock.dto;

import com.delmas.gestiondestock.Model.Ventes;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {

    private VentesDto ventes;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
