package com.delmas.gestiondestock.Repository;

import com.delmas.gestiondestock.Model.CommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeFournisseurRepository extends JpaRepository<CommandeFournisseur,Integer> {
}
