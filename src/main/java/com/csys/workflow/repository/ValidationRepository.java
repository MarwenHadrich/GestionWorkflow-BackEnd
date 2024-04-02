package com.csys.workflow.repository;

import com.csys.workflow.domain.Validation;
import java.lang.Integer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Validation entity.
 */
@Repository
public interface ValidationRepository extends JpaRepository<Validation, Integer> {
}

