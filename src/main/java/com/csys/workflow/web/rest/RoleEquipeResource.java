package com.csys.workflow.web.rest;

import com.csys.workflow.dto.RoleEquipeDTO;
import com.csys.workflow.service.RoleEquipeService;
import com.csys.workflow.util.RestPreconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleEquipeResource {
    private static final String ENTITY_NAME = "roleEquipe";

    private final RoleEquipeService roleEquipeService;

    private final Logger log = LoggerFactory.getLogger(RoleEquipeResource.class);

    public RoleEquipeResource(RoleEquipeService roleEquipeService) {
        this.roleEquipeService = roleEquipeService;
    }

  /*  @PostMapping("/role-equipes")
    public ResponseEntity<RoleEquipeDTO> createRoleEquipe(@Valid @RequestBody RoleEquipeDTO roleEquipeDTO, BindingResult bindingResult) throws URISyntaxException, MethodArgumentNotValidException {
        log.debug("REST request to save RoleEquipe : {}", roleEquipeDTO);
        if (roleEquipeDTO.getIdRoleEquipe() != null) {
            bindingResult.addError(new FieldError("RoleEquipeDTO", "idRoleEquipe", "POST method does not accept " + ENTITY_NAME + " with code"));
            throw new MethodArgumentNotValidException(null, bindingResult);
        }
        if (bindingResult.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResult);
        }
        RoleEquipeDTO result = roleEquipeService.save(roleEquipeDTO);
        return ResponseEntity.created(new URI("/api/role-equipes/" + result.getIdRoleEquipe())).body(result);
    }

    @PutMapping("/role-equipes/{id}")
    public ResponseEntity<RoleEquipeDTO> updateRoleEquipe(@PathVariable Integer id, @Valid @RequestBody RoleEquipeDTO roleEquipeDTO) throws MethodArgumentNotValidException {
        log.debug("Request to update RoleEquipe: {}", id);
        roleEquipeDTO.setIdRoleEquipe(id);
        RoleEquipeDTO result = roleEquipeService.update(roleEquipeDTO);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/role-equipes/{id}")
    public ResponseEntity<RoleEquipeDTO> getRoleEquipe(@PathVariable Integer id) {
        log.debug("Request to get RoleEquipe: {}", id);
        RoleEquipeDTO dto = roleEquipeService.findById(id);
        RestPreconditions.checkFound(dto, "roleEquipe.NotFound");
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping("/role-equipes")
    public List<RoleEquipeDTO> getAllRoleEquipes() {
        log.debug("Request to get all RoleEquipes");
        return roleEquipeService.findAll();
    }

    @DeleteMapping("/role-equipes/{id}")
    public ResponseEntity<Void> deleteRoleEquipe(@PathVariable Integer id) {
        log.debug("Request to delete RoleEquipe: {}", id);
        roleEquipeService.delete(id);
        return ResponseEntity.ok().build();
    }*/
}
