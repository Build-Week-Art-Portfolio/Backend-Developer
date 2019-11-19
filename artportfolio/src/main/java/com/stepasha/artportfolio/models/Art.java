package com.stepasha.artportfolio.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.stepasha.artportfolio.logging.Loggable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//TODO 31 Art Model Class

@Loggable
@Entity
@Table(name = "art")
public class Art extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long artid;

    private String imageurl;

    private String title;
    private String description;
    @Column(nullable = true)
    private String arttype;

    @ManyToOne
    @JoinColumn(name = "categoryid")
    @JsonIgnoreProperties("arts")
    private Categories categories;

    @OneToMany(mappedBy = "art", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties("art")
    private List<Portfolio> portfolios = new ArrayList<>();


    public Art(){}

    public Art(String imageurl, String title, String description, String arttype, Categories categories) {
        this.imageurl = imageurl;
        this.title = title;
        this.description = description;
        this.arttype = arttype;
        this.categories = categories;
    }

    public long getArtid() {
        return artid;
    }

    public void setArtid(long artid) {
        this.artid = artid;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArttype() {
        return arttype;
    }

    public void setArttype(String arttype) {
        this.arttype = arttype;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }
}
