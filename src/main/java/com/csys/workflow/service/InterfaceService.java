package com.csys.workflow.service;

import com.csys.workflow.domain.Interface;
import com.csys.workflow.dto.InterfaceDTO;
import com.csys.workflow.factory.InterfaceFactory;
import com.csys.workflow.repository.InterfaceRepository;
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Interface.
 */
@Service
@Transactional
public class InterfaceService {
  private final Logger log = LoggerFactory.getLogger(InterfaceService.class);

  private final InterfaceRepository interfaceRepository;

  public InterfaceService(InterfaceRepository interfaceRepository) {
    this.interfaceRepository=interfaceRepository;
  }

  /**
   * Save a interfaceDTO.
   *
   * @param interfaceDTO
   * @return the persisted entity
   */
  public InterfaceDTO save(InterfaceDTO interfaceDTO) {
    log.debug("Request to save Interface: {}",interfaceDTO);
    Interface inter = InterfaceFactory.interDTOToInterface(interfaceDTO);
    inter = interfaceRepository.save(inter);
    InterfaceDTO resultDTO = InterfaceFactory.interToInterfaceDTO(inter);
    return resultDTO;
  }
  public  boolean existsById(Integer id) {
    return interfaceRepository.existsById(id);
  }

  /**
   * Update a interfaceDTO.
   *
   * @param interfaceDTO
   * @return the updated entity
   */
  public InterfaceDTO update(InterfaceDTO interfaceDTO) {
    log.debug("Request to update Interface: {}",interfaceDTO);
    Interface inBase= interfaceRepository.findById(interfaceDTO.getIdInterface()).orElse(null);
    Preconditions.checkArgument(inBase != null, "inter.NotFound");
    Interface inter = InterfaceFactory.interDTOToInterface(interfaceDTO);
    inter = interfaceRepository.save(inter);
    InterfaceDTO resultDTO = InterfaceFactory.interToInterfaceDTO(inter);
    return resultDTO;
  }

  /**
   * Get one interfaceDTO by id.
   *
   * @param id the id of the entity
   * @return the entity DTO
   */
  @Transactional(
      readOnly = true
  )
  public InterfaceDTO findById(Integer id) {
    log.debug("Request to get Interface: {}",id);
    Interface inter= interfaceRepository.findById(id).orElse(null);
    InterfaceDTO dto = InterfaceFactory.interToInterfaceDTO(inter);
    return dto;
  }

  /**
   * Get one inter by id.
   *
   * @param id the id of the entity
   * @return the entity
   */
  @Transactional(
      readOnly = true
  )
  public Interface findInterface(Integer id) {
    log.debug("Request to get Interface: {}",id);
    Interface inter= interfaceRepository.findById(id).orElse(null);
    return inter;
  }

  /**
   * Get all the interfaces.
   *
   * @return the the list of entities
   */
  @Transactional(
      readOnly = true
  )
  public List<InterfaceDTO> findAll() {
    log.debug("Request to get All Interfaces");
    List<Interface> result= interfaceRepository.findAll();
    return InterfaceFactory.interToInterfaceDTOs(result);
  }

  /**
   * Delete inter by id.
   *
   * @param id the id of the entity
   */
  public void delete(Integer id) {
    log.debug("Request to delete Interface: {}",id);
    interfaceRepository.deleteById(id);
  }
}

