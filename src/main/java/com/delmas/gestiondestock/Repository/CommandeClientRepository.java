package com.delmas.gestiondestock.Repository;

import com.delmas.gestiondestock.Model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommandeClientRepository extends JpaRepository<CommandeClient,Integer> {
    List<CommandeClient> findAllByClientId(Integer id);
}
