package com.csys.workflow.dto;

import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class InterfaceDTO {


    private Integer idInterface;

    @Size(
            min = 0,
            max = 50
    )
    private String nomInterface;

    /* List<TicketDTO> ticketList;

    private List<WorkflowDTO> workflowList;

    private List<DemandeDTO> demandeList;*/

    public Integer getIdInterface() {
        return idInterface;
    }

    public void setIdInterface(Integer idInterface) {
        this.idInterface = idInterface;
    }

    public String getNomInterface() {
        return nomInterface;
    }

    public void setNomInterface(String nomInterface) {
        this.nomInterface = nomInterface;
    }
/*
    public List<TicketDTO> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<TicketDTO> ticketList) {
        this.ticketList = ticketList;
    }

    public List<WorkflowDTO> getWorkflowList() {
        return workflowList;
    }

    public void setWorkflowList(List<WorkflowDTO> workflowList) {
        this.workflowList = workflowList;
    }

    public List<DemandeDTO> getDemandeList() {
        return demandeList;
    }

    public void setDemandeList(List<DemandeDTO> demandeList) {
        this.demandeList = demandeList;
    }
*/
}
