package com.csys.workflow.factory;

import com.csys.workflow.domain.Equipe;
import com.csys.workflow.domain.RoleEquipe;
import com.csys.workflow.domain.RoleEquipePK;
import com.csys.workflow.dto.EquipeDTO;
import com.csys.workflow.dto.RoleEquipeDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class EquipeFactory {
  public static EquipeDTO equipeToEquipeDTO(Equipe equipe) {
    EquipeDTO equipeDTO=new EquipeDTO();
    equipeDTO.setIdEquipe(equipe.getIdEquipe());
    equipeDTO.setNomEquipe(equipe.getNomEquipe());
//    equipeDTO.setRoleEquipeList(equipe.getRoleEquipeList());
    equipeDTO.setRoleEquipeList(RoleEquipeFactory.roleequipeToRoleEquipeDTOs(equipe.getRoleEquipeList()));
    return equipeDTO;
  }

  public static Equipe equipeDTOToEquipe(EquipeDTO equipeDTO) {
    Equipe equipe=new Equipe();
    equipe.setIdEquipe(equipeDTO.getIdEquipe());
    equipe.setNomEquipe(equipeDTO.getNomEquipe());
    //equipe.setRoleEquipeList(equipeDTO.getRoleEquipeList());
    List<RoleEquipe> roleEquipeList = new ArrayList<>();

    // Assuming EquipeDTO contains RoleEquipeDTO list
    List<RoleEquipeDTO> roleEquipeDTOList = equipeDTO.getRoleEquipeList();
    if (roleEquipeDTOList != null) {
      for (RoleEquipeDTO roleEquipeDTO : roleEquipeDTOList) {
        // Create a new RoleEquipe instance
        RoleEquipe roleEquipe = new RoleEquipe();

        // Populate RoleEquipe attributes from RoleEquipeDTO
        roleEquipe.getRoleEquipePK().setRoleEquipe(roleEquipeDTO.getRoleEquipe());
        roleEquipe.getRoleEquipePK().setIdEmploye(roleEquipeDTO.getIdEmploye());
        roleEquipe.getRoleEquipePK().setIdEquipe(equipe.getIdEquipe());

        // Add RoleEquipe instance to the list
        roleEquipeList.add(roleEquipe);
      }
    }

    // Set the list of RoleEquipe instances to Equipe
    equipe.setRoleEquipeList(roleEquipeList);

    return equipe;
  }

  public static List<EquipeDTO> equipeToEquipeDTOs(List<Equipe> equipes) {
    List<EquipeDTO> equipesDTO=new ArrayList<>();
    equipes.forEach(x -> {
      equipesDTO.add(equipeToEquipeDTO(x));
    } );
    return equipesDTO;
  }
}

