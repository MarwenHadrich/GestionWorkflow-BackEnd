package com.csys.workflow.factory;

import com.csys.workflow.domain.Demande;
import com.csys.workflow.domain.Employe;
import com.csys.workflow.domain.Interface;
import com.csys.workflow.domain.TypeEmploye;
import com.csys.workflow.dto.DemandeDTO;
import java.util.ArrayList;
import java.util.List;

public class DemandeFactory {

    public static DemandeDTO demandeToDemandeDTO(Demande demande) {
        DemandeDTO demandeDTO = new DemandeDTO();
        demandeDTO.setIdDemande(demande.getIdDemande());
        demandeDTO.setDateCreationDemande(demande.getDateCreationDemande());
        //demandeDTO.setTicketDataList(TicketDataFactory.ticketdataToTicketDataDTOs(demande.getTicketDataList()));
        // demandeDTO.setValidationList(ValidationFactory.validationToValidationDTOs(demande.getValidationList()));
        //demandeDTO.setEmploye(EmployeFactory.employeToEmployeDTO(demande.getEmploye()));
        // demandeDTO.setInterface1(InterfaceFactory.interToInterfaceDTO(demande.getInterface1()));
        demandeDTO.setIdEmploye(EmployeFactory.employeToEmployeDTO(demande.getEmploye()).getIdEmploye());
        demandeDTO.setNomEmplye(EmployeFactory.employeToEmployeDTO(demande.getEmploye()).getNomEmploye());
        demandeDTO.setPrenomEmploye(EmployeFactory.employeToEmployeDTO(demande.getEmploye()).getPrenomEmploye());
        demandeDTO.setIdInterface(InterfaceFactory.interToInterfaceDTO(demande.getInterface1()).getIdInterface());
        demandeDTO.setNomInterface(InterfaceFactory.interToInterfaceDTO(demande.getInterface1()).getNomInterface());
        return demandeDTO;
    }

    public static Demande demandeDTOToDemande(DemandeDTO demandeDTO) {
        Demande demande = new Demande();
        demande.setIdDemande(demandeDTO.getIdDemande());
        demande.setDateCreationDemande(demandeDTO.getDateCreationDemande());
//        demande.setTicketDataList(TicketDataFactory. demandeDTO.getTicketDataList());
//        demande.setValidationList(ValidationFactory demandeDTO.getValidationList());
//        demande.setEmploye(EmployeFactory.employeToEmployeDTO(demandeDTO.getEmploye()) );
        //demande.setInterface1(InterfaceFactory.interDTOToInterface(demandeDTO.getInterface1()));
        // Set the Employe object

            Employe employe = new Employe();
            TypeEmploye typeEmploye=new TypeEmploye();
            employe.setTypeEmploye(typeEmploye);
            employe.setIdEmploye(demandeDTO.getIdEmploye());
            demande.setEmploye(employe);


        // Set the Interface object

            Interface interface1 = new Interface();
            interface1.setIdInterface(demandeDTO.getIdInterface());
            demande.setInterface1(interface1);


        return demande;
    }

    public static List<DemandeDTO> demandeToDemandeDTOs(List<Demande> demandes) {
        List<DemandeDTO> demandesDTO = new ArrayList<>();
        demandes.forEach(x -> {
            demandesDTO.add(demandeToDemandeDTO(x));
        });
        return demandesDTO;
    }
}
