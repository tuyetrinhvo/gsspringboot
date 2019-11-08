package com.cesi.bankonet.repository;

import com.cesi.bankonet.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}


