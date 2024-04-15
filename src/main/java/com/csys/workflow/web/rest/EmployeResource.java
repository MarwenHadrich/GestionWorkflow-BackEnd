package com.csys.workflow.web.rest;

import com.csys.workflow.dto.EmployeDTO;
import com.csys.workflow.service.EmployeService;
import com.csys.workflow.service.TypeEmployeService;
import com.csys.workflow.util.RestPreconditions;
import java.lang.Integer;
import java.lang.String;
import java.lang.Void;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import javax.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for managing Employe.
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class EmployeResource {
  private static final String ENTITY_NAME = "employe";

  private final EmployeService employeService;
  private  final TypeEmployeService typeEmployeService;

  private final Logger log = LoggerFactory.getLogger(EmployeService.class);

  public EmployeResource(EmployeService employeService, TypeEmployeService typeEmployeService) {
    this.employeService=employeService;
      this.typeEmployeService = typeEmployeService;
  }

  /**
   * POST  /employes : Create a new employe.
   *
   * @param employeDTO
   * @param bindingResult
   * @return the ResponseEntity with status 201 (Created) and with body the new employe, or with status 400 (Bad Request) if the employe has already an ID
   * @throws URISyntaxException if the Location URI syntax is incorrect
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PostMapping("/employes")
  public ResponseEntity<EmployeDTO> createEmploye(@Valid @RequestBody EmployeDTO employeDTO, BindingResult bindingResult) throws URISyntaxException, MethodArgumentNotValidException {
    log.debug("REST request to save Employe : {}", employeDTO);
    // Check if an employee with the same ID already exists
//    if (employeService.existsById(employeDTO.getIdEmploye())) {
//      bindingResult.addError(new FieldError("EmployeDTO", "idEmploye", "Employee with this ID already exists."));
//      throw new MethodArgumentNotValidException(null, bindingResult);
//    }
    // Check if the idTypeEmploye associated with the employe exists
    if (employeDTO.getTypeEmploye() != null && !typeEmployeService.existsById(employeDTO.getIdTypeEmploye())) {
      bindingResult.addError(new FieldError("EmployeDTO", "typeEmploye.idTypeEmploye", "TypeEmploye with this ID does not exist."));
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    if ( employeDTO.getIdEmploye() != null) {
      bindingResult.addError( new FieldError("EmployeDTO","idEmploye","POST method does not accepte "+ENTITY_NAME+" with code"));
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    if (bindingResult.hasErrors()) {
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    EmployeDTO result = employeService.save(employeDTO);
    return ResponseEntity.created( new URI("/api/employes/"+ result.getIdEmploye())).body(result);
  }

  /**
   * PUT  /employes : Updates an existing employe.
   *
   * @param id
   * @param employeDTO the employe to update
   * @return the ResponseEntity with status 200 (OK) and with body the updated employe,
   * or with status 400 (Bad Request) if the employe is not valid,
   * or with status 500 (Internal Server Error) if the employe couldn't be updated
   * @throws org.springframework.web.bind.MethodArgumentNotValidException
   */
  @PutMapping("/employes/{id}")
  public ResponseEntity<EmployeDTO> updateEmploye(@PathVariable Integer id, @Valid @RequestBody EmployeDTO employeDTO ,BindingResult bindingResult) throws MethodArgumentNotValidException {
    log.debug("Request to update Employe: {}",id);
    // Check if the idTypeEmploye associated with the employe exists
    if (employeDTO.getTypeEmploye() != null && !typeEmployeService.existsById(employeDTO.getIdTypeEmploye())) {
      bindingResult.addError(new FieldError("EmployeDTO", "typeEmploye.idTypeEmploye", "TypeEmploye with this ID does not exist."));
      throw new MethodArgumentNotValidException(null, bindingResult);
    }
    employeDTO.setIdEmploye(id);
    EmployeDTO result =employeService.update(employeDTO);
    return ResponseEntity.ok().body(result);
  }

  /**
   * GET /employes/{id} : get the "id" employe.
   *
   * @param id the id of the employe to retrieve
   * @return the ResponseEntity with status 200 (OK) and with body of employe, or with status 404 (Not Found)
   */
  @GetMapping("/employes/{id}")
  public ResponseEntity<EmployeDTO> getEmploye(@PathVariable Integer id) {
    log.debug("Request to get Employe: {}",id);
    EmployeDTO dto = employeService.findById(id);
    RestPreconditions.checkFound(dto, "employe.NotFound");
    return ResponseEntity.ok().body(dto);
  }

  /**
   * GET /employes : get all the employes.
   *
   * @return the ResponseEntity with status 200 (OK) and the list of employes in body
   */
  @GetMapping("/employes")
  public List<EmployeDTO> getAllEmployes() {
    log.debug("Request to get all  Employes : {}");
    return employeService.findAll();
  }

  /**
   * DELETE  /employes/{id} : delete the "id" employe.
   *
   * @param id the id of the employe to delete
   * @return the ResponseEntity with status 200 (OK)
   */
  @DeleteMapping("/employes/{id}")
  public ResponseEntity<Void> deleteEmploye(@PathVariable Integer id) {
    log.debug("Request to delete Employe: {}",id);
    employeService.delete(id);
    return ResponseEntity.ok().build();
  }
  @GetMapping("/login/{login}")
  public ResponseEntity<EmployeDTO> getEmployeByLogin(@PathVariable String login) {
    log.debug("Request to get Employe: {}",login);
    EmployeDTO dto = employeService.findByLogin(login);
    RestPreconditions.checkFound(dto, "employe.NotFound");
    return ResponseEntity.ok().body(dto);
  }
}

