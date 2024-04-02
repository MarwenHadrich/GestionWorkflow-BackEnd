package com.csys.workflow.factory;

import com.csys.workflow.domain.Equipe;
import com.csys.workflow.dto.EquipeDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class EquipeFactory {
  public static EquipeDTO equipeToEquipeDTO(Equipe equipe) {
    EquipeDTO equipeDTO=new EquipeDTO();
    equipeDTO.setIdEquipe(equipe.getIdEquipe());
    equipeDTO.setNomEquipe(equipe.getNomEquipe());
 //   equipeDTO.setRoleEquipeList(equipe.getRoleEquipeList());
    return equipeDTO;
  }

  public static Equipe equipeDTOToEquipe(EquipeDTO equipeDTO) {
    Equipe equipe=new Equipe();
    equipe.setIdEquipe(equipeDTO.getIdEquipe());
    equipe.setNomEquipe(equipeDTO.getNomEquipe());
   // equipe.setRoleEquipeList(equipeDTO.getRoleEquipeList());
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

