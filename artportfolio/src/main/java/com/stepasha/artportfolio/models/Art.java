package com.stepasha.artportfolio.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(nullable = true)
    private String posteddate;
    @Column(nullable = true)
    private String imageurl;
    @Column(nullable = true)
    private String title;
    @Column(nullable = true)
    private String description;
    @Column(nullable = true)
    private String arttype;

 //   @ManyToOne
 //   @JoinColumn(name = "categoryid")
 //   @JsonIgnoreProperties("arts")
 //   private Category category;



   @ManyToOne
   @JoinColumn(name = "users",
           nullable = true)
   @JsonIgnore
   private User user;


    public Art(){}

    public Art(String posteddate, String imageurl, String title, String description, String arttype, User user) {
        this.posteddate = posteddate;
        this.imageurl = imageurl;
        this.title = title;
        this.description = description;
        this.arttype = arttype;
       this.user = user;

    }

    public long getArtid() {
        return artid;
    }

    public void setArtid(long artid) {
        this.artid = artid;
    }

    public String getPosteddate() {
        return posteddate;
    }

    public void setPosteddate(String posteddate) {
        this.posteddate = posteddate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

  //  public Category getCategory() {
  //      return category;
  //  }
//
  //  public void setCategory(Category category) {
     //   this.category = category;
   // }

}
