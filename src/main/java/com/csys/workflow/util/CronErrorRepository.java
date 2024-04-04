/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this workflow file, choose Tools | workflows
 * and open the workflow in the editor.
 */
package com.csys.workflow.util;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bassatine
 */
public interface CronErrorRepository extends JpaRepository<CronError, Integer> {
        
}
