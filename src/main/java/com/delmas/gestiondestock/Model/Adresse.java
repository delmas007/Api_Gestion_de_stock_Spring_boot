package com.delmas.gestiondestock.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Adresse implements Serializable {
    @Column(name = "adresse1")
    private String adresse1;

    @Column(name = "adresse2")
    private  String adresse2;

    @Column(name = "pays")
    private String pays;

    @Column(name = "ville")
    private String ville;

    @Column(name = "codePostale")
    private String codePostale;

}
