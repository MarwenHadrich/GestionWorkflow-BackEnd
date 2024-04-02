package com.csys.workflow.service;

import com.csys.workflow.domain.Demande;
import com.csys.workflow.dto.DemandeDTO;
import com.csys.workflow.factory.DemandeFactory;
import com.csys.workflow.repository.DemandeRepository;
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.List;
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

  public DemandeService(DemandeRepository demandeRepository) {
    this.demandeRepository=demandeRepository;
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
}

