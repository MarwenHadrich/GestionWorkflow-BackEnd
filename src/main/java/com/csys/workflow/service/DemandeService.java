package com.csys.workflow.service;

import com.csys.workflow.domain.Demande;
import com.csys.workflow.domain.Employe;
import com.csys.workflow.dto.DemandeDTO;
import com.csys.workflow.factory.DemandeFactory;
import com.csys.workflow.repository.DemandeRepository;
import com.csys.workflow.repository.EmployeRepository;
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Demande.
 */
@Service
@Transactional
public class DemandeService {
  private final Logger log = LoggerFactory.getLogger(DemandeService.class);

  private final DemandeRepository demandeRepository;
  private  final EmployeRepository employeRepository;

  public DemandeService(DemandeRepository demandeRepository, EmployeService employeService, EmployeRepository employeRepository) {
    this.demandeRepository=demandeRepository;

      this.employeRepository = employeRepository;
  }

  /**
   * Save a demandeDTO.
   *
   * @param demandeDTO
   * @return the persisted entity
   */
  public DemandeDTO save(DemandeDTO demandeDTO) {
    log.debug("Request to save Demande: {}",demandeDTO);
    Demande demande = DemandeFactory.demandeDTOToDemande(demandeDTO);
    demande = demandeRepository.save(demande);
    DemandeDTO resultDTO = DemandeFactory.demandeToDemandeDTO(demande);
    return resultDTO;
  }

  /**
   * Update a demandeDTO.
   *
   * @param demandeDTO
   * @return the updated entity
   */

  public DemandeDTO update(DemandeDTO demandeDTO) {
    log.debug("Request to update Demande: {}",demandeDTO);
    Demande inBase= demandeRepository.findById(demandeDTO.getIdDemande()).orElse(null);
    Preconditions.checkArgument(inBase != null, "demande.NotFound");
    Demande demande = DemandeFactory.demandeDTOToDemande(demandeDTO);
    demande = demandeRepository.save(demande);
    DemandeDTO resultDTO = DemandeFactory.demandeToDemandeDTO(demande);
    return resultDTO;
  }

  /**
   * Get one demandeDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */
  @Transactional(
      readOnly = true
  )
  public DemandeDTO findById(Integer id) {
    log.debug("Request to get Demande: {}",id);
    Demande demande= demandeRepository.findById(id).orElse(null);
    DemandeDTO dto = DemandeFactory.demandeToDemandeDTO(demande);
    return dto;
  }
  public  boolean existsById(Integer id) {
    return demandeRepository.existsById(id);
  }

  /**
   * Get one demande by id.
   *
   * @param id the id of the entity
   * @return the entity
   */
  @Transactional(
      readOnly = true
  )
  public Demande findDemande(Integer id) {
    log.debug("Request to get Demande: {}",id);
    Demande demande= demandeRepository.findById(id).orElse(null);
    return demande;
  }

  /**
   * Get all the demandes.
   *
   * @return the the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public List<DemandeDTO> findAll() {
    log.debug("Request to get All Demandes");
    List<Demande> result= demandeRepository.findAll();
    return DemandeFactory.demandeToDemandeDTOs(result);
  }

  /**
   * Delete demande by id.
   *
   * @param id the id of the entity
   */
  public void delete(Integer id) {
    log.debug("Request to delete Demande: {}",id);
    demandeRepository.deleteById(id);
  }
  @Transactional(readOnly = true)
  public List<DemandeDTO> findDemandsByEmployeId(Integer idEmploye) {
    // Retrieve the Employe object corresponding to the given ID
    Optional<Employe> employeOptional = employeRepository.findById(idEmploye);

    // If the Employe object is found, use it to find the associated demands
    if (((Optional<?>) employeOptional).isPresent()) {
      Employe employe = employeOptional.get();
      // Retrieve the list of demands associated with the given employe
      List<Demande> demands = demandeRepository.findByEmploye(employe);

      // Convert the list of Demande entities to DemandeDTOs
      return DemandeFactory.demandeToDemandeDTOs(demands);
    } else {
      // Handle the case where the Employe object with the given ID is not found
      // For example, you could return an empty list or throw an exception
      return Collections.emptyList();
    }
  }
}

