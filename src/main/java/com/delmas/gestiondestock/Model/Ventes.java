package com.delmas.gestiondestock.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ventes")
public class Ventes extends AbstractEntity{

    @Column(name = "code")
    private String code;

    @Column(name = "dateVente")
    private Instant dateVente;

    @Column(name = "commentaire")
    private String commentaire;

    @Column(name = "idEntreprise")
    private  Integer idEntreprise;

    @OneToMany(mappedBy = "ventes")
    private List<LigneVente> ligneVentes;

}
