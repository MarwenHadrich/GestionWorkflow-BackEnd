package com.csys.workflow.dto;

public class RoleEquipeDTO {    
    
    private int roleEquipe;
    
    private int idEmploye;

    
    private int idEquipe;

    private String nomEmploye;

    private String designation;
    
 private EmployeDTO employe;

 private RoleDTO role;

    public int getRoleEquipe() {
        return roleEquipe;
    }

    public void setRoleEquipe(int roleEquipe) {
        this.roleEquipe = roleEquipe;
    }

    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public int getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }



    public EmployeDTO getEmploye() {
        return employe;
    }

    public void setEmploye(EmployeDTO employe) {
        this.employe = employe;
    }




    public RoleDTO getRole() {
        return role;
    }

    public void setRole(RoleDTO role) {
        this.role = role;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

