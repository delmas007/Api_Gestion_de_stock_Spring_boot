package com.delmas.gestiondestock.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
public class Category extends AbstractEntity{

    @Column(name = "code")
    private  String code;

    @Column(name = "designation")
    private  String designation;

    @OneToMany(mappedBy = "category")
    private List<Article> articles;

}
