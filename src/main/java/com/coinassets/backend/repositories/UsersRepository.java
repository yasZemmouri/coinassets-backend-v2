package com.coinassets.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coinassets.backend.models.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {


}


