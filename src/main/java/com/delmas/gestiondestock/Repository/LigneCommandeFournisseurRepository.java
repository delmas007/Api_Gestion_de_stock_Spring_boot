package com.delmas.gestiondestock.Repository;

import com.delmas.gestiondestock.Model.LigneCommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneCommandeFournisseurRepository extends JpaRepository<LigneCommandeFournisseur,Integer> {
}
