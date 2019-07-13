package com.renlaApp.backend.Renla.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.renlaApp.backend.Renla.model.Land;

public interface LandRepository extends JpaRepository<Land, Long> {

}
