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
    @JoinColumn(name = "artistid")
    @JsonIgnoreProperties("portfolios")
    private Artist artist;

    public Portfolio(){}

    public Portfolio(Art art, Artist artist) {
        this.art = art;
        this.artist = artist;
    }

    public Art getArt() {
        return art;
    }

    public void setArt(Art art) {
        this.art = art;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
