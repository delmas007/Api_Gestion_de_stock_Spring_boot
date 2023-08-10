package com.delmas.gestiondestock.Repository;

import com.delmas.gestiondestock.Model.CommandeClient;
import com.delmas.gestiondestock.Model.CommandeFournisseur;
import com.delmas.gestiondestock.Model.Fournisseur;
import com.delmas.gestiondestock.dto.FournisseurDto;
import io.micrometer.observation.ObservationFilter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommandeFournisseurRepository extends JpaRepository<CommandeFournisseur,Integer> {
    Optional<CommandeFournisseur> findCommandeFournisseurByCode(String code);

    List<CommandeClient> findAllByFournisseurId(Integer id);
}
