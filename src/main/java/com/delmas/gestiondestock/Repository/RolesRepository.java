package com.delmas.gestiondestock.Repository;

import com.delmas.gestiondestock.Model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles,Integer> {
}
