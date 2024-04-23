package com.csys.workflow.dto;

import java.lang.Integer;
import java.lang.String;

public class MenusDTO {
  private Integer codMnP;

  private String module;

  private String desMenuP;

  private String desMenuPSec;

  private String mnName;

  private String logo;

  public Integer getCodMnP() {
    return codMnP;
  }

  public void setCodMnP(Integer codMnP) {
    this.codMnP = codMnP;
  }

  public String getModule() {
    return module;
  }

  public void setModule(String module) {
    this.module = module;
  }

  public String getDesMenuP() {
    return desMenuP;
  }

  public void setDesMenuP(String desMenuP) {
    this.desMenuP = desMenuP;
  }

  public String getDesMenuPSec() {
    return desMenuPSec;
  }

  public void setDesMenuPSec(String desMenuPSec) {
    this.desMenuPSec = desMenuPSec;
  }

  public String getMnName() {
    return mnName;
  }

  public void setMnName(String mnName) {
    this.mnName = mnName;
  }

  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }
}

