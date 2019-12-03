package com.cesi.bankonet.repository;

import com.cesi.bankonet.entity.CompteEpargne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteEpargneRepository extends JpaRepository<CompteEpargne, Integer> {
}
