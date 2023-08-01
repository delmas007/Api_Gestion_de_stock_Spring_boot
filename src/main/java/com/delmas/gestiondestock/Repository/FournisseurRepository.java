package com.delmas.gestiondestock.Repository;

import com.delmas.gestiondestock.Model.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurRepository extends JpaRepository<Fournisseur,Integer> {
}
