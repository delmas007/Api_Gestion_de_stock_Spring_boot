package com.delmas.gestiondestock.Repository;

import com.delmas.gestiondestock.Model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise,Integer> {
}
