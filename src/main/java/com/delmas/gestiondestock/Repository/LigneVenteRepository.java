package com.delmas.gestiondestock.Repository;

import com.delmas.gestiondestock.Model.LigneVente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LigneVenteRepository extends JpaRepository<LigneVente,Integer> {
    List<LigneVente> findAllByVenteId(Integer id);
}
