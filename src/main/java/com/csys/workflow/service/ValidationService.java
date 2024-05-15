package com.csys.workflow.service;

import com.csys.workflow.domain.Demande;
import com.csys.workflow.domain.Interface;
import com.csys.workflow.domain.Ticket;
import com.csys.workflow.domain.Validation;
import com.csys.workflow.dto.DemandeDTO;
import com.csys.workflow.dto.EmployeDTO;
import com.csys.workflow.dto.TicketDTO;
import com.csys.workflow.dto.ValidationDTO;
import com.csys.workflow.factory.DemandeFactory;
import com.csys.workflow.factory.TicketFactory;
import com.csys.workflow.factory.ValidationFactory;
import com.csys.workflow.repository.ValidationRepository;
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Validation.
 */
@Service
@Transactional
public class ValidationService {
  private final Logger log = LoggerFactory.getLogger(ValidationService.class);

  private final ValidationRepository validationRepository;
  private final DemandeService demandeService;

  public ValidationService(ValidationRepository validationRepository, DemandeService demandeService) {
    this.validationRepository=validationRepository;
      this.demandeService = demandeService;
  }

  /**
   * Save a validationDTO.
   *
   * @param validationDTO
   * @return the persisted entity
   */
  public ValidationDTO save(ValidationDTO validationDTO) {
    log.debug("Request to save Validation: {}",validationDTO);
    Validation validation = ValidationFactory.validationDTOToValidation(validationDTO);
    validation = validationRepository.save(validation);
    ValidationDTO resultDTO = ValidationFactory.validationToValidationDTO(validation);
    return resultDTO;
  }
  public  boolean existsById(Integer id) {
    return validationRepository.existsById(id);
  }

  /**
   * Update a validationDTO.
   *
   * @param validationDTO
   * @return the updated entity
   */
  public ValidationDTO update(ValidationDTO validationDTO) {
    log.debug("Request to update Validation: {}",validationDTO);
    Validation inBase= validationRepository.findById(validationDTO.getIdValidation()).orElse(null);
    Preconditions.checkArgument(inBase != null, "validation.NotFound");
    Validation validation = ValidationFactory.validationDTOToValidation(validationDTO);
    validation = validationRepository.save(validation);
    ValidationDTO resultDTO = ValidationFactory.validationToValidationDTO(validation);
    return resultDTO;
  }

  /**
   * Get one validationDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */
  @Transactional(
      readOnly = true
  )
  public ValidationDTO findById(Integer id) {
    log.debug("Request to get Validation: {}",id);
    Validation validation= validationRepository.findById(id).orElse(null);
    ValidationDTO dto = ValidationFactory.validationToValidationDTO(validation);
    return dto;
  }

  /**
   * Get one validation by id.
   *
   * @param id the id of the entity
   * @return the entity
   */
  @Transactional(
      readOnly = true
  )
  public Validation findValidation(Integer id) {
    log.debug("Request to get Validation: {}",id);
    Validation validation= validationRepository.findById(id).orElse(null);
    return validation;
  }

  /**
   * Get all the validations.
   *
   * @return the the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public List<ValidationDTO> findAll() {
    log.debug("Request to get All Validations");
    List<Validation> result= validationRepository.findAll();
    return ValidationFactory.validationToValidationDTOs(result);
  }

  /**
   * Delete validation by id.
   *
   * @param id the id of the entity
   */
  public void delete(Integer id) {
    log.debug("Request to delete Validation: {}",id);
    validationRepository.deleteById(id);
  }
  public List<ValidationDTO> findValidationsByDemandId(Integer idDemande) {
    DemandeDTO demandeDTO = demandeService.findById(idDemande);
    if (demandeDTO!=null) {
      List<Validation> validations = validationRepository.findByDemande_IdDemande(demandeDTO.getIdDemande());
      return ValidationFactory.validationToValidationDTOs(validations);
    } else {
      List<Validation> validations = validationRepository.findAll();
      return ValidationFactory.validationToValidationDTOs(validations);
    }
  }
}

