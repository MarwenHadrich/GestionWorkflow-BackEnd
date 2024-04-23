package com.csys.workflow.factory;

import com.csys.workflow.domain.Employe;
import com.csys.workflow.domain.TypeEmploye;
import com.csys.workflow.dto.EmployeDTO;
import com.csys.workflow.dto.TypeEmployeDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class EmployeFactory {
  public static EmployeDTO employeToEmployeDTO(Employe employe) {
    EmployeDTO employeDTO=new EmployeDTO();
    employeDTO.setIdEmploye(employe.getIdEmploye());
    employeDTO.setNomEmploye(employe.getNomEmploye());
    employeDTO.setPrenomEmploye(employe.getPrenomEmploye());
    employeDTO.setEmailEmploye(employe.getEmailEmploye());
    employeDTO.setDateNaissance(employe.getDateNaissance());
    employeDTO.setAdresse(employe.getAdresse());
    employeDTO.setTel(employe.getTel());
    employeDTO.setLogin(employe.getLogin());
    employeDTO.setMdp(employe.getMdp());
    //employeDTO.setValidationList(ValidationFactory.validationToValidationDTOs(employe.getValidationList()));
    //employeDTO.setDemandeList(DemandeFactory.demandeToDemandeDTOs(employe.getDemandeList()));
    // employeDTO.setTypeEmploye(TypeEmployeFactory.typeemployeToTypeEmployeDTO(employe.getTypeEmploye()));
   // employeDTO.setRoleEquipeList(RoleEquipeFactory.roleequipeToRoleEquipeDTOs(employe.getRoleEquipeList()));
    employeDTO.setIdTypeEmploye(TypeEmployeFactory.typeemployeToTypeEmployeDTO(employe.getTypeEmploye()).getIdTypeEmploye());
    if (employe.getTypeEmploye() != null) {
      employeDTO.setTypeEmploye(TypeEmployeFactory.typeemployeToTypeEmployeDTO(employe.getTypeEmploye()).getTypeemploye());
    }
    else{
      throw new IllegalStateException("TypeEmploye is null for the given Employe");

    }
    return employeDTO;
  }


  public static Employe employeDTOToEmploye(EmployeDTO employeDTO) {
    Employe employe=new Employe();
    employe.setIdEmploye(employeDTO.getIdEmploye());
    employe.setNomEmploye(employeDTO.getNomEmploye());
    employe.setPrenomEmploye(employeDTO.getPrenomEmploye());
    employe.setEmailEmploye(employeDTO.getEmailEmploye());
    employe.setDateNaissance(employeDTO.getDateNaissance());
    employe.setAdresse(employeDTO.getAdresse());
    employe.setTel(employeDTO.getTel());
    employe.setLogin(employeDTO.getLogin());
    employe.setMdp(employeDTO.getMdp());

    if (employeDTO.getIdTypeEmploye() != null) {
      TypeEmploye typeEmploye = new TypeEmploye();
      typeEmploye.setIdTypeEmploye(employeDTO.getIdTypeEmploye());
      employe.setTypeEmploye(typeEmploye);
    }

    return employe;
  }

  public static List<EmployeDTO> employeToEmployeDTOs(List<Employe> employes) {
    List<EmployeDTO> employesDTO=new ArrayList<>();
    employes.forEach(x -> {
      employesDTO.add(employeToEmployeDTO(x));
    } );
    return employesDTO;
  }
}

