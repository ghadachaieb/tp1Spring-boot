package com.ghada.parfum.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ghada.parfum.entities.Parfum;

public interface ParfumRepository extends JpaRepository<Parfum,Long> {

}
