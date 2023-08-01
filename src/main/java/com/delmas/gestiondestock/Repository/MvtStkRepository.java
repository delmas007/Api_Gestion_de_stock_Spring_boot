package com.delmas.gestiondestock.Repository;

import com.delmas.gestiondestock.Model.MvtStk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MvtStkRepository extends JpaRepository<MvtStk,Integer> {
}
