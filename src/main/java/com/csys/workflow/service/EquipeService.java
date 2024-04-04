package com.csys.workflow.service;

import com.csys.workflow.domain.Equipe;
import com.csys.workflow.dto.EquipeDTO;
import com.csys.workflow.factory.EquipeFactory;
import com.csys.workflow.repository.EquipeRepository;
import com.google.common.base.Preconditions;
import java.lang.Integer;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing Equipe.
 */
@Service
@Transactional
public class EquipeService {

    private final Logger log = LoggerFactory.getLogger(EquipeService.class);

    private final EquipeRepository equipeRepository;

    public EquipeService(EquipeRepository equipeRepository) {
        this.equipeRepository = equipeRepository;
    }

    /**
     * Save a equipeDTO.
     *
     * @param equipeDTO
     * @return the persisted entity
     */
    public EquipeDTO save(EquipeDTO equipeDTO) {
        log.debug("Request to save Equipe: {}", equipeDTO);
        Equipe equipe = EquipeFactory.equipeDTOToEquipe(equipeDTO);
        equipe = equipeRepository.save(equipe);
        EquipeDTO resultDTO = EquipeFactory.equipeToEquipeDTO(equipe);
        return resultDTO;
    }

    /**
     * Update a equipeDTO.
     *
     * @param equipeDTO
     * @return the updated entity
     */
    public EquipeDTO update(EquipeDTO equipeDTO) {
        log.debug("Request to update Equipe: {}", equipeDTO);
        Equipe inBase = equipeRepository.findById(equipeDTO.getIdEquipe()).orElse(null);
        Preconditions.checkArgument(inBase != null, "equipe.NotFound");
        Equipe equipe = EquipeFactory.equipeDTOToEquipe(equipeDTO);
        equipe = equipeRepository.save(equipe);
        EquipeDTO resultDTO = EquipeFactory.equipeToEquipeDTO(equipe);
        return resultDTO;
    }
    public  boolean existsById(Integer id) {
        return equipeRepository.existsById(id);
    }

    /**
     * Get one equipeDTO by id.
     *
     * @param id the id of the entity
     * @return the entity DTO
     */
    @Transactional(
            readOnly = true
    )
    public EquipeDTO findById(Integer id) {
        log.debug("Request to get Equipe: {}", id);
        Equipe equipe = equipeRepository.findById(id).orElse(null);
        EquipeDTO dto = EquipeFactory.equipeToEquipeDTO(equipe);
        return dto;
    }

    /**
     * Get one equipe by id.
     *
     * @param id the id of the entity
     * @return the entity
     */
    @Transactional(
            readOnly = true
    )
    public Equipe findEquipe(Integer id) {
        log.debug("Request to get Equipe: {}", id);
        Equipe equipe = equipeRepository.findById(id).orElse(null);
        return equipe;
    }

    /**
     * Get all the equipes.
     *
     * @return the the list of entities
     */
    @Transactional(
            readOnly = true
    )
    public List<EquipeDTO> findAll() {
        log.debug("Request to get All Equipes");
        List<Equipe> result = equipeRepository.findAll();
        return EquipeFactory.equipeToEquipeDTOs(result);
    }

    /**
     * Delete equipe by id.
     *
     * @param id the id of the entity
     */
    public void delete(Integer id) {
        log.debug("Request to delete Equipe: {}", id);
        equipeRepository.deleteById(id);
    }
}
