package com.upiiz.ORM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upiiz.ORM.Models.ClienteEntity;

@Repository
public interface ClienteRepositoyry extends JpaRepository<ClienteEntity, Long> {
    // @Query
}