package com.stepasha.artportfolio.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "portfolio")
public class Portfolio extends Auditable implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "artid")
    @JsonIgnoreProperties("portfolios")
    private Art art;

    @Id
    @ManyToOne
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties("portfolios")
    private User user;

    public Portfolio(){}

    public Portfolio(Art art, User user) {
        this.art = art;
        this.user = user;
    }

    public Art getArt() {
        return art;
    }

    public void setArt(Art art) {
        this.art = art;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
