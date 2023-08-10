package com.delmas.gestiondestock.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Data
//class abstraite pour les entites communs de plusieurs table
@MappedSuperclass
//Permet de cree creationDate et lors de la modification
// lastModifiedDate lors de l'enregistrement
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    @CreatedDate
    @Column(name = "creationDate", nullable = false)
//    ignorer ces attribut dans l'api car c'est automatique
    @JsonIgnore
    private Instant creationDate;

    @LastModifiedDate
    @Column(name = "lastUpdateDate")
    @JsonIgnore
    private Instant lastModifiedDate;


}
