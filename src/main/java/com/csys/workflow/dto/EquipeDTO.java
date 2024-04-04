package com.csys.workflow.dto;

import com.csys.workflow.domain.RoleEquipe;

import java.lang.Integer;
import java.lang.String;
import java.util.Collection;
import java.util.List;
import javax.validation.constraints.Size;

public class EquipeDTO {

  private Integer idEquipe;

  @Size(
      min = 0,
      max = 50
  )
  private String nomEquipe;

  private List<RoleEquipe> roleEquipeList;

  public Integer getIdEquipe() {
    return idEquipe;
  }

  public void setIdEquipe(Integer idEquipe) {
    this.idEquipe = idEquipe;
  }

  public String getNomEquipe() {
    return nomEquipe;
  }

  public void setNomEquipe(String nomEquipe) {
    this.nomEquipe = nomEquipe;
  }

  public List<RoleEquipe> getRoleEquipeList() {
    return roleEquipeList;
  }

  public void setRoleEquipeList(List<RoleEquipe> roleEquipeList) {
    this.roleEquipeList = roleEquipeList;
  }

  /*public List getRoleEquipeList() {
    return roleEquipeList;
  }

  public void setRoleEquipeList(List roleEquipeList) {
    this.roleEquipeList = roleEquipeList;
  }*/
}

