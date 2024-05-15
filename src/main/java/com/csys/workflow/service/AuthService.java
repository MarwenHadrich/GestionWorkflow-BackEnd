//package com.csys.workflow.service;
//
//import com.csys.workflow.dto.EmployeDTO;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.apache.http.auth.AuthenticationException;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//
//@Service
//public class AuthService {
//
//    private final EmployeService employeService;
//
//    @Value("${jwt.secret}")
//    private String jwtSecret;
//
//    @Value("${jwt.expiration}")
//    private int jwtExpirationMs;
//
//    public AuthService(EmployeService employeService) {
//        this.employeService = employeService;
//    }
//
//    public String authenticate(String login, String password) throws AuthenticationException {
//        EmployeDTO employeDTO = employeService.findByLogin(login);
//
//        if (employeDTO != null && employeDTO.getMdp().equals(password)) {
//            return generateJwtToken(employeDTO); // Generate JWT token upon successful authentication
//        } else {
//            throw new AuthenticationException("Invalid credentials");
//        }
//    }
//
//    private String generateJwtToken(EmployeDTO employeDTO) {
//        Date expirationDate = new Date(System.currentTimeMillis() + jwtExpirationMs);
//        return Jwts.builder()
//                .setSubject(employeDTO.getLogin())
//                .setIssuedAt(new Date())
//                .setExpiration(expirationDate)
//                .signWith(SignatureAlgorithm.HS512, jwtSecret)
//                .compact();
//    }
//}



package com.csys.workflow.service;

import com.csys.workflow.domain.Employe;
import com.csys.workflow.dto.EmployeDTO;
import org.apache.http.auth.AuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private EmployeService employeService;

    public EmployeDTO authenticate(String login, String password) throws AuthenticationException {
        // Authenticate user based on login and password
        EmployeDTO employeDTO = employeService.findByLogin(login);

        if (employeDTO != null && employeDTO.getPassword().equals(password)) {
            // Fetch additional user information if needed and populate the EmployeDTO object
            // For example, fetch the name and surname from the database
            EmployeDTO employeDTO1 = employeService.findById(employeDTO.getIdEmploye());
            if (employeDTO1 != null) {
                // Set additional user information in the EmployeDTO object
                employeDTO.setNomEmploye(employeDTO1.getNomEmploye());
                employeDTO.setPrenomEmploye(employeDTO1.getPrenomEmploye());
                // Add any other required user information to the EmployeDTO object
            }
            return employeDTO;
        } else {
            throw new AuthenticationException("Invalid credentials");
        }
    }
}
