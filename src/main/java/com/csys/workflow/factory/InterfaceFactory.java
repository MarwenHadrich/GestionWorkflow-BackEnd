package com.csys.workflow.factory;

import com.csys.workflow.domain.Interface;
import com.csys.workflow.dto.InterfaceDTO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.List;

public class InterfaceFactory {
  public static InterfaceDTO interToInterfaceDTO(Interface inter) {
    InterfaceDTO interDTO=new InterfaceDTO();
    interDTO.setIdInterface(inter.getIdInterface());
    interDTO.setNomInterface(inter.getNomInterface());
    interDTO.setDateCreation(inter.getDateCreation());
    interDTO.setDateModification(inter.getDateModification());
 //   interDTO.setDateCreationInterface(inter.getDateCreationInterface());
//    interDTO.setTicketDataList(inter.getTicketDataList());
//    interDTO.setValidationList(inter.getValidationList());
//    interDTO.setEmploye(inter.getEmploye());
//    interDTO.setInterface1(inter.getInterface1());
    return interDTO;
  }

  public static Interface interDTOToInterface(InterfaceDTO interDTO) {
    Interface inter=new Interface();
    inter.setIdInterface(interDTO.getIdInterface());
    inter.setNomInterface(interDTO.getNomInterface());
    inter.setDateCreation(new Date());
//    inter.setDateCreationInterface(interDTO.getDateCreationInterface());
//    inter.setTicketDataList(interDTO.getTicketDataList());
//    inter.setValidationList(interDTO.getValidationList());
//    inter.setInterface1(interDTO.getInterface1());
    return inter;
  }

  public static List<InterfaceDTO> interToInterfaceDTOs(List<Interface> inters) {
    List<InterfaceDTO> intersDTO=new ArrayList<>();
    inters.forEach(x -> {
      intersDTO.add(interToInterfaceDTO(x));
    } );
    return intersDTO;
  }
}

