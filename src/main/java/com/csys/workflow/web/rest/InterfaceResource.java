package com.csys.workflow.web.rest;

import com.csys.workflow.dto.InterfaceDTO;
import com.csys.workflow.service.InterfaceService;
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
public class InterfaceResource {
    private static final String ENTITY_NAME = "interface";

    private final InterfaceService interfaceService;

    private final Logger log = LoggerFactory.getLogger(InterfaceResource.class);

    public InterfaceResource(InterfaceService interfaceService) {
        this.interfaceService = interfaceService;
    }

    @PostMapping("/interfaces")
    public ResponseEntity<InterfaceDTO> createInterface(@Valid @RequestBody InterfaceDTO interfaceDTO, BindingResult bindingResult) throws URISyntaxException, MethodArgumentNotValidException {
        log.debug("REST request to save Interface : {}", interfaceDTO);
//        if (interfaceDTO.getIdInterface() != null && interfaceService.existsById(interfaceDTO.getIdInterface())) {
//            bindingResult.addError(new FieldError("InterfaceDTO", "id", "Interface with this ID already exists."));
//            throw new MethodArgumentNotValidException(null, bindingResult);
//        }

        if (interfaceDTO.getIdInterface() != null) {
            bindingResult.addError(new FieldError("InterfaceDTO", "idInterface", "POST method does not accept " + ENTITY_NAME + " with code"));
            throw new MethodArgumentNotValidException(null, bindingResult);
        }
        if (bindingResult.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResult);
        }
        InterfaceDTO result = interfaceService.save(interfaceDTO);
        return ResponseEntity.created(new URI("/api/interfaces/" + result.getIdInterface())).body(result);
    }

    @PutMapping("/interfaces/{id}")
    public ResponseEntity<InterfaceDTO> updateInterface(@PathVariable Integer id, @Valid @RequestBody InterfaceDTO interfaceDTO) throws MethodArgumentNotValidException {
        log.debug("Request to update Interface: {}", id);
        interfaceDTO.setIdInterface(id);
        InterfaceDTO result = interfaceService.update(interfaceDTO);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/interfaces/{id}")
    public ResponseEntity<InterfaceDTO> getInterface(@PathVariable Integer id) {
        log.debug("Request to get Interface: {}", id);
        InterfaceDTO dto = interfaceService.findById(id);
        RestPreconditions.checkFound(dto, "interface.NotFound");
        return ResponseEntity.ok().body(dto);
    }

    @GetMapping("/interfaces")
    public List<InterfaceDTO> getAllInterfaces() {
        log.debug("Request to get all Interfaces");
        return interfaceService.findAll();
    }

    @DeleteMapping("/interfaces/{id}")
    public ResponseEntity<Void> deleteInterface(@PathVariable Integer id) {
        log.debug("Request to delete Interface: {}", id);
        interfaceService.delete(id);
        return ResponseEntity.ok().build();
    }
}
