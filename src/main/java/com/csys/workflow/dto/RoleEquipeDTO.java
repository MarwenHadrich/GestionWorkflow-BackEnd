package com.csys.workflow.dto;

public class RoleEquipeDTO {    
    
    private int roleEquipe;
    
    private int idEmploye;
    
    private int idEquipe;
    
  private EmployeDTO employe;

  private EquipeDTO equipe;

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

    public EquipeDTO getEquipe() {
        return equipe;
    }

    public void setEquipe(EquipeDTO equipe) {
        this.equipe = equipe;
    }

    

    public RoleDTO getRole() {
        return role;
    }

    public void setRole(RoleDTO role) {
        this.role = role;
    }

}

