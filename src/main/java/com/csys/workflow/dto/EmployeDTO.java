package com.csys.workflow.dto;

import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.List;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmployeDTO {


    private Integer idEmploye;

    @Size(
            min = 0,
            max = 100
    )
    private String nomEmploye;

    @Size(
            min = 0,
            max = 100
    )
    private String prenomEmploye;

    @Size(
            min = 0,
            max = 255
    )
    private String emailEmploye;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @Size(
            min = 0,
            max = 255
    )
    private String adresse;

    private Integer tel;

    @Size(
            min = 0,
            max = 255
    )
    private String login;

    @Size(
            min = 0,
            max = 255
    )
    private String mdp;

    //private List<ValidationDTO> validationList;

   // private List<DemandeDTO> demandeList;
    private Integer idTypeEmploye;

  private String typeEmploye;



    //private List<RoleEquipeDTO> roleEquipeList;

    public Integer getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(Integer idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public String getPrenomEmploye() {
        return prenomEmploye;
    }

    public void setPrenomEmploye(String prenomEmploye) {
        this.prenomEmploye = prenomEmploye;
    }

    public String getEmailEmploye() {
        return emailEmploye;
    }

    public void setEmailEmploye(String emailEmploye) {
        this.emailEmploye = emailEmploye;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getTypeEmploye() {
        return typeEmploye;
    }

    public void setTypeEmploye(String typeEmploye) {
        this.typeEmploye = typeEmploye;
    }



    public void setIdTypeEmploye(Integer idTypeEmploye) {
        this.idTypeEmploye = idTypeEmploye;
    }

    public Integer getIdTypeEmploye() {
        return idTypeEmploye;
    }

    /*public List<ValidationDTO> getValidationList() {
        return validationList;
    }

    public void setValidationList(List<ValidationDTO> validationList) {
        this.validationList = validationList;
    }

    public List<DemandeDTO> getDemandeList() {
        return demandeList;
    }

    public void setDemandeList(List<DemandeDTO> demandeList) {
        this.demandeList = demandeList;
    }*/

//    public TypeEmployeDTO getTypeEmploye() {
//        return typeEmploye;
//    }
//
//    public void setTypeEmploye(TypeEmployeDTO typeEmploye) {
//        this.typeEmploye = typeEmploye;
//    }

//    public List<RoleEquipeDTO> getRoleEquipeList() {
//        return roleEquipeList;
//    }

//    public void setRoleEquipeList(List<RoleEquipeDTO> roleEquipeList) {
//        this.roleEquipeList = roleEquipeList;
//    }

}
