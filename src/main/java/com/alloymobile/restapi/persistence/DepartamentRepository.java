package com.alloymobile.restapi.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentRepository extends JpaRepository<Department, Long> {

}
