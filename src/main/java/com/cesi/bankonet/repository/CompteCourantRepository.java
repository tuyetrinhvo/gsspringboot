package com.cesi.bankonet.repository;

import com.cesi.bankonet.entity.CompteCourant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompteCourantRepository extends JpaRepository<CompteCourant, Integer> {
}
