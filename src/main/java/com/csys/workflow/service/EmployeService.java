package com.csys.workflow.service;

import com.csys.workflow.domain.Employe;
import com.csys.workflow.dto.EmployeDTO;
import com.csys.workflow.factory.EmployeFactory;
import com.csys.workflow.repository.EmployeRepository;
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Employe.
 */
@Service
@Transactional
public class EmployeService {
  private final Logger log = LoggerFactory.getLogger(EmployeService.class);

  private final EmployeRepository employeRepository;

  public EmployeService(EmployeRepository employeRepository) {
    this.employeRepository=employeRepository;
  }

  /**
   * Save a employeDTO.
   *
   * @param employeDTO
   * @return the persisted entity
   */
  public EmployeDTO save(EmployeDTO employeDTO) {
    log.debug("Request to save Employe: {}",employeDTO);
    Employe employe = EmployeFactory.employeDTOToEmploye(employeDTO);
    employe = employeRepository.save(employe);
    EmployeDTO resultDTO = EmployeFactory.employeToEmployeDTO(employe);
    return resultDTO;
  }

  /**
   * Update a employeDTO.
   *
   * @param employeDTO
   * @return the updated entity
   */
  public EmployeDTO update(EmployeDTO employeDTO) {
    log.debug("Request to update Employe: {}",employeDTO);
    Employe inBase= employeRepository.findById(employeDTO.getIdEmploye()).orElse(null);
    Preconditions.checkArgument(inBase != null, "employe.NotFound");
    Employe employe = EmployeFactory.employeDTOToEmploye(employeDTO);
    employe = employeRepository.save(employe);
    EmployeDTO resultDTO = EmployeFactory.employeToEmployeDTO(employe);
    return resultDTO;
  }

  /**
   * Get one employeDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */
  @Transactional(
      readOnly = true
  )
  public EmployeDTO findById(Integer id) {
    log.debug("Request to get Employe: {}",id);
    Employe employe= employeRepository.findById(id).orElse(null);
    EmployeDTO employeDTO = EmployeFactory.employeToEmployeDTO(employe);
    return employeDTO;
  }

  /**
   * Get one employe by id.
   *
   * @param id the id of the entity
   * @return the entity
   */
  @Transactional(
      readOnly = true
  )
  public Employe findEmploye(Integer id) {
    log.debug("Request to get Employe: {}",id);
    Employe employe= employeRepository.findById(id).orElse(null);
    return employe;
  }
  public boolean existsById(Integer id) {
    return employeRepository.existsById(id);
  }

  /**
   * Get all the employes.
   *
   * @return the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public List<EmployeDTO> findAll() {
    log.debug("Request to get All Employes");
    List<Employe> result= employeRepository.findAll();
    return EmployeFactory.employeToEmployeDTOs(result);
  }

  /**
   * Delete employe by id.
   *
   * @param id the id of the entity
   */
  public void delete(Integer id) {
    log.debug("Request to delete Employe: {}",id);
    employeRepository.deleteById(id);
  }
  @Transactional(readOnly = true)
  public EmployeDTO findByLogin(String login) {
    log.debug("Request to get Employe by login: {}", login);
    Employe employe = employeRepository.findByLogin(login);
    return EmployeFactory.employeToEmployeDTO(employe);
  }
  @Transactional(readOnly = true)
  public boolean existsByLogin(String login) {
    log.debug("Request to check if Employe exists by login: {}", login);
    Employe employe = employeRepository.findByLogin(login);
    return employe != null;
  }
  @Transactional(readOnly = true)
  public EmployeDTO findByEmail(String email) {
    log.debug("Request to get Employe by email: {}", email);
    Employe employe = employeRepository.findByEmailEmploye(email);
    return EmployeFactory.employeToEmployeDTO(employe);
  }
  @Transactional(readOnly = true)
  public boolean existsByEmail(String email) {
    log.debug("Request to check if Employe exists by login: {}", email);
    Employe employe = employeRepository.findByEmailEmploye(email);
    return employe != null;
  }
  @Transactional(readOnly = true)
  public boolean existsByTel(Integer tel) {
    log.debug("Request to check if Employe exists by login: {}", tel);
    Employe employe = employeRepository.findByTel(tel);
    return employe != null;
  }

}

