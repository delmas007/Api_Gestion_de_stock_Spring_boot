package com.delmas.gestiondestock.Repository;

import com.delmas.gestiondestock.Model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeClientRepository extends JpaRepository<CommandeClient,Integer> {
}
