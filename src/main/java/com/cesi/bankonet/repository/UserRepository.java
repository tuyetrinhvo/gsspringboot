package com.cesi.bankonet.repository;

import com.cesi.bankonet.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {

}
