package com.delmas.gestiondestock.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AdresseDto {
    private String adresse1;

    private String adresse2;

    private String pays;

    private String ville;

    private String codePostale;
}
