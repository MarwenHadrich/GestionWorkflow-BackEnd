package com.csys.workflow.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
@Data

@Entity
public class Token {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Id", nullable = false)
    private int id;
    @Basic
    @Column(name = "is_logged_out", nullable = true)
    private Boolean loggedOut;

    @Basic
    @Column(name = "token", nullable = true, length = 255)
    private String token;
    @ManyToOne
    @JoinColumn(name = "id_employe", referencedColumnName = "id_employe")
    private Employe employe;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Token token1 = (Token) o;

        if (id != token1.id) return false;
        if (loggedOut != null ? !loggedOut.equals(token1.loggedOut) : token1.loggedOut != null) return false;
        if (token != null ? !token.equals(token1.token) : token1.token != null) return false;

        return true;
    }
    public boolean isLoggedOut() {
        return loggedOut;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (loggedOut != null ? loggedOut.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        return result;
    }
}
