package com.csys.workflow.config;

import com.csys.workflow.dto.EmployeDTO;
import com.csys.workflow.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Set;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private EmployeService employeService;



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Retrieve EmployeDTO from EmployeService using username
        EmployeDTO employeDTO = employeService.findByLogin(username);

//        // For demonstration purposes, creating a sample EmployeDTO
//        EmployeDTO employeDTO = new EmployeDTO();
//        employeDTO.setLogin("username");
//        employeDTO.setMdp("password");
//        employeDTO.setTypeEmploye("ROLE_USER");

        if (employeDTO == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }

        // Create a set to hold the authorities
        Set<GrantedAuthority> authorities = new HashSet<>();

        // Add the roles as authorities
        authorities.add(new SimpleGrantedAuthority(employeDTO.getTypeEmploye()));

        // Create and return UserDetails object with username, password, and authorities
        return org.springframework.security.core.userdetails.User.builder()
                .username(employeDTO.getLogin())
                .password(employeDTO.getMdp())
                .authorities(authorities)
                .build();
    }

}
