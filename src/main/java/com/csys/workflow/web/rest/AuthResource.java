//package com.csys.workflow.web.rest;
//
//import com.csys.workflow.dto.EmployeDTO;
//import com.csys.workflow.dto.LoginRequest;
//import com.csys.workflow.service.AuthService;
//import org.apache.http.auth.AuthenticationException;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/auth")
//@CrossOrigin("*")
//public class AuthResource {
//
//    private final AuthService authService;
//
//    public AuthResource(AuthService authService) {
//        this.authService = authService;
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) throws AuthenticationException {
//        String jwtToken = authService.authenticate(loginRequest.getLogin(), loginRequest.getPassword());
//        return ResponseEntity.ok(jwtToken); // Send JWT token as part of the response
//    }
//}
package com.csys.workflow.web.rest;

import com.csys.workflow.dto.EmployeDTO;
import com.csys.workflow.dto.LoginRequest;
import com.csys.workflow.service.AuthService;
import org.apache.http.auth.AuthenticationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthResource {

    private final AuthService authService;

    public AuthResource(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<EmployeDTO> login(@RequestBody LoginRequest loginRequest) throws AuthenticationException {
        EmployeDTO authenticatedEmployee = authService.authenticate(loginRequest.getLogin(), loginRequest.getPassword());
        return ResponseEntity.ok(authenticatedEmployee);
    }





}


