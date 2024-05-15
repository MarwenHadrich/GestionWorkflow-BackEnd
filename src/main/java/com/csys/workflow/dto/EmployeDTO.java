package com.csys.workflow.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.List;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Setter
@Getter
@Data

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
    private String username;

    @Size(
            min = 0,
            max = 255
    )
    private String password;

    //private List<ValidationDTO> validationList;

   // private List<DemandeDTO> demandeList;
    private Integer idTypeEmploye;

  private String typeEmploye;



    //private List<RoleEquipeDTO> roleEquipeList;


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
