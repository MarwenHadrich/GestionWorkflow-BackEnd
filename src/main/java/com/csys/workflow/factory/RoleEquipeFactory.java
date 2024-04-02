package com.csys.workflow.factory;

import com.csys.workflow.domain.RoleEquipe;
import com.csys.workflow.domain.RoleEquipePK;
import com.csys.workflow.dto.RoleEquipeDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class RoleEquipeFactory {
    
    public static RoleEquipeDTO roleequipeToRoleEquipeDTO(RoleEquipe roleequipe) {
        RoleEquipeDTO roleequipeDTO = new RoleEquipeDTO();
        roleequipeDTO.setIdEmploye(roleequipe.getRoleEquipePK().getIdEmploye());
        roleequipeDTO.setIdEquipe(roleequipe.getRoleEquipePK().getIdEquipe());
        roleequipeDTO.setRoleEquipe(roleequipe.getRoleEquipePK().getRoleEquipe());
        roleequipeDTO.setEmploye(EmployeFactory.employeToEmployeDTO(roleequipe.getEmploye()));
        roleequipeDTO.setEquipe(EquipeFactory.equipeToEquipeDTO(roleequipe.getEquipe()));
        roleequipeDTO.setRole(RoleFactory.roleToRoleDTO(roleequipe.getRole()));
        return roleequipeDTO;
    }
    
    public static RoleEquipe roleequipeDTOToRoleEquipe(RoleEquipeDTO roleequipeDTO) {
        RoleEquipe roleequipe = new RoleEquipe();
        RoleEquipePK roleEquipePK = new RoleEquipePK();
        roleEquipePK.setIdEmploye(roleequipeDTO.getIdEmploye());
        roleEquipePK.setIdEquipe(roleequipeDTO.getIdEquipe());
        roleEquipePK.setRoleEquipe(roleequipeDTO.getRoleEquipe());
        roleequipe.setRoleEquipePK(roleEquipePK);
        return roleequipe;
    }
    
    public static List<RoleEquipeDTO> roleequipeToRoleEquipeDTOs(List<RoleEquipe> roleequipes) {
        List<RoleEquipeDTO> roleequipesDTO = new ArrayList<>();
        roleequipes.forEach(x -> {
            roleequipesDTO.add(roleequipeToRoleEquipeDTO(x));
        });
        return roleequipesDTO;
    }
}
