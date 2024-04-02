package com.csys.workflow.service;

import com.csys.workflow.domain.Etape;
import com.csys.workflow.dto.EtapeDTO;
import com.csys.workflow.factory.EtapeFactory;
import com.csys.workflow.repository.EtapeRepository;
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Etape.
 */
@Service
@Transactional
public class EtapeService {
  private final Logger log = LoggerFactory.getLogger(EtapeService.class);

  private final EtapeRepository etapeRepository;

  public EtapeService(EtapeRepository etapeRepository) {
    this.etapeRepository=etapeRepository;
  }

  /**
   * Save a etapeDTO.
   *
   * @param etapeDTO
   * @return the persisted entity
   */
  public EtapeDTO save(EtapeDTO etapeDTO) {
    log.debug("Request to save Etape: {}",etapeDTO);
    Etape etape = EtapeFactory.etapeDTOToEtape(etapeDTO);
    etape = etapeRepository.save(etape);
    EtapeDTO resultDTO = EtapeFactory.etapeToEtapeDTO(etape);
    return resultDTO;
  }

  /**
   * Update a etapeDTO.
   *
   * @param etapeDTO
   * @return the updated entity
   */
  public EtapeDTO update(EtapeDTO etapeDTO) {
    log.debug("Request to update Etape: {}",etapeDTO);
    Etape inBase= etapeRepository.findById(etapeDTO.getIdEtape()).orElse(null);
    Preconditions.checkArgument(inBase != null, "etape.NotFound");
    Etape etape = EtapeFactory.etapeDTOToEtape(etapeDTO);
    etape = etapeRepository.save(etape);
    EtapeDTO resultDTO = EtapeFactory.etapeToEtapeDTO(etape);
    return resultDTO;
  }

  /**
   * Get one etapeDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */
  @Transactional(
      readOnly = true
  )
  public EtapeDTO findById(Integer id) {
    log.debug("Request to get Etape: {}",id);
    Etape etape= etapeRepository.findById(id).orElse(null);
    EtapeDTO dto = EtapeFactory.etapeToEtapeDTO(etape);
    return dto;
  }

  /**
   * Get one etape by id.
   *
   * @param id the id of the entity
   * @return the entity
   */
  @Transactional(
      readOnly = true
  )
  public Etape findEtape(Integer id) {
    log.debug("Request to get Etape: {}",id);
    Etape etape= etapeRepository.findById(id).orElse(null);
    return etape;
  }
  public boolean existsById(Integer id) {
    return etapeRepository.existsById(id);
  }

  /**
   * Get all the etapes.
   *
   * @return the the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public List<EtapeDTO> findAll() {
    log.debug("Request to get All Etapes");
    List<Etape> result= etapeRepository.findAll();
    return EtapeFactory.etapeToEtapeDTOs(result);
  }

  /**
   * Delete etape by id.
   *
   * @param id the id of the entity
   */
  public void delete(Integer id) {
    log.debug("Request to delete Etape: {}",id);
    etapeRepository.deleteById(id);
  }
}

