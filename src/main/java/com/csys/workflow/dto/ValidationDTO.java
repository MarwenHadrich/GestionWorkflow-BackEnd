package com.csys.workflow.dto;

import java.lang.Boolean;
import java.lang.Integer;
import javax.validation.constraints.NotNull;

public class ValidationDTO {

  private Integer idValidation;

  private Boolean reponse;


  private Integer idDemande;
  private Integer IdEmploye;
  private Integer idEtape;



  public Integer getIdValidation() {
    return idValidation;
  }

  public void setIdValidation(Integer idValidation) {
    this.idValidation = idValidation;
  }

  public Boolean getReponse() {
    return reponse;
  }

  public void setReponse(Boolean reponse) {
    this.reponse = reponse;
  }


  public Integer getIdDemande() {
    return idDemande;
  }

  public void setIdDemande(Integer idDemande) {
    this.idDemande = idDemande;
  }

  public Integer getIdEmploye() {
    return IdEmploye;
  }

  public void setIdEmploye(Integer idEmploye) {
    IdEmploye = idEmploye;
  }

  public Integer getIdEtape() {
    return idEtape;
  }

  public void setIdEtape(Integer idEtape) {
    this.idEtape = idEtape;
  }
}

