package com.csys.workflow.repository;

import com.csys.workflow.domain.Employe;
import java.lang.Integer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Employe entity.
 */
@Repository
public interface EmployeRepository extends JpaRepository<Employe, Integer> {
    Employe findByLogin(String login);

    Employe findByEmailEmploye(String email);
    Employe findByTel(Integer tel);
}

