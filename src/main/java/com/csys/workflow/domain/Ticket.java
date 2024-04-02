/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this workflow file, choose Tools | workflows
 * and open the workflow in the editor.
 */
package com.csys.workflow.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrateur
 */
@Entity
@Table(name = "Ticket")
@NamedQueries({
    @NamedQuery(name = "Ticket.findAll", query = "SELECT t FROM Ticket t")})
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ticket", nullable = false)
    private Integer idTicket;
    @Column(name = "ordre_ticket")
    private Integer ordreTicket;
    @Size(max = 50)
    @Column(name = "nom_ticket", length = 50)
    private String nomTicket;
    @Column(name = "minLength")
    private Integer minLength;
    @Column(name = "maxLength")
    private Integer maxLength;
    @Size(max = 255)
    @Column(name = "regle_ticket", length = 255)
    private String regleTicket;
    @OneToMany(mappedBy = "ticket")
    private List<TicketData> ticketDataList;
    @JoinColumn(name = "id_interface", referencedColumnName = "id_interface")
    @ManyToOne
    private Interface interface1;
    @JoinColumn(name = "id_type_ticket", referencedColumnName = "id_type_ticket")
    @ManyToOne
    private TypeTicket typeTicket;

    public Ticket() {
    }

    public Ticket(Integer idTicket) {
        this.idTicket = idTicket;
    }

    public Integer getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Integer idTicket) {
        this.idTicket = idTicket;
    }

    public Integer getOrdreTicket() {
        return ordreTicket;
    }

    public void setOrdreTicket(Integer ordreTicket) {
        this.ordreTicket = ordreTicket;
    }

    public String getNomTicket() {
        return nomTicket;
    }

    public void setNomTicket(String nomTicket) {
        this.nomTicket = nomTicket;
    }

    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    public String getRegleTicket() {
        return regleTicket;
    }

    public void setRegleTicket(String regleTicket) {
        this.regleTicket = regleTicket;
    }

    public List<TicketData> getTicketDataList() {
        return ticketDataList;
    }

    public void setTicketDataList(List<TicketData> ticketDataList) {
        this.ticketDataList = ticketDataList;
    }

    public Interface getInterface1() {
        return interface1;
    }

    public void setInterface1(Interface interface1) {
        this.interface1 = interface1;
    }





    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTicket != null ? idTicket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ticket)) {
            return false;
        }
        Ticket other = (Ticket) object;
        if ((this.idTicket == null && other.idTicket != null) || (this.idTicket != null && !this.idTicket.equals(other.idTicket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.csys.workflow.domain.Ticket[ idTicket=" + idTicket + " ]";
    }

    public TypeTicket getTypeTicket() {
        return typeTicket;
    }

    public void setTypeTicket(TypeTicket typeTicket) {
        this.typeTicket = typeTicket;
    }
}
