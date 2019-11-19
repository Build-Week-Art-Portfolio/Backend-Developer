package com.stepasha.artportfolio.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stepasha.artportfolio.logging.Loggable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//TODO 32 table for artist

@Loggable
@Entity
@Table(name = "artist")
public class Artist extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long authorid;
    private String fname;
    private String lname;

    @OneToMany(mappedBy = "artist", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("artist")
    private List<Portfolio> portfolios = new ArrayList<>();

    public Artist(){}

    public Artist(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public long getAuthorid() {
        return authorid;
    }

    public void setAuthorid(long authorid) {
        this.authorid = authorid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }
}
