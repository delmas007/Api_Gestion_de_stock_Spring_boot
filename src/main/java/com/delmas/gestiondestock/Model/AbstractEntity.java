package com.delmas.gestiondestock.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.models.auth.In;
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

//    @CreatedDate
    @Column(name = "creationDate", nullable = true)
    private Instant creationDatee;

//    @LastModifiedDate
    @Column(name = "lastUpdateDate")
    private Instant lastModifiedDatee;

    @PrePersist
//    avant enregistrement
    void  prePersist(){
        creationDatee = Instant.now();
    }
    @PreUpdate
//    avant maj
    void preUpdate(){
        lastModifiedDatee = Instant.now();
    }


}
