package com.csys.workflow.dto;

import com.csys.workflow.domain.Demande;
import com.csys.workflow.domain.Ticket;
import java.lang.Integer;
import java.lang.String;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TicketDataDTO {

  private Integer idTicketData;

  @Size(
      min = 0,
      max = 255
  )
  private String valeurTicket;

  //private DemandeDTO demande;

  //private TicketDTO ticket;
  private Integer idDemande;
  private Integer idTicket;

  public Integer getIdTicketData() {
    return idTicketData;
  }

  public void setIdTicketData(Integer idTicketData) {
    this.idTicketData = idTicketData;
  }

  public String getValeurTicket() {
    return valeurTicket;
  }

  public void setValeurTicket(String valeurTicket) {
    this.valeurTicket = valeurTicket;
  }

  public Integer getIdDemande() {
    return idDemande;
  }

  public void setIdDemande(Integer idDemande) {
    this.idDemande = idDemande;
  }

  public Integer getIdTicket() {
    return idTicket;
  }

  public void setIdTicket(Integer idTicket) {
    this.idTicket = idTicket;
  }

//    public DemandeDTO getDemande() {
//        return demande;
//    }
//
//    public void setDemande(DemandeDTO demande) {
//        this.demande = demande;
//    }
//
//    public TicketDTO getTicket() {
//        return ticket;
//    }
//
//    public void setTicket(TicketDTO ticket) {
//        this.ticket = ticket;
//    }

}

