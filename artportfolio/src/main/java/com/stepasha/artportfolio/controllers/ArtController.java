package com.stepasha.artportfolio.controllers;



//TODO 38 Art Controller

import com.stepasha.artportfolio.models.Art;
import com.stepasha.artportfolio.services.ArtService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/art")
public class ArtController {

    @Autowired
    private ArtService artService;

    private static final Logger logger = LoggerFactory.getLogger(ArtController.class);

    // http://localhost:2222/art/arts
    @GetMapping(value = "/arts", produces = "application/json")
    ResponseEntity<?> getArts(){
        logger.info("art/arts Accessed");
        List<Art> arts = artService.findAll();
        return new ResponseEntity<>(arts, HttpStatus.OK);
    }
    // http://localhost:2222/art/art/1
    @PutMapping(value = "/art/{id}", consumes = {"application/json"})
    public ResponseEntity<?> updateArtById(HttpServletRequest request, @RequestBody Art art, @PathVariable long artid) {
        logger.info(request.getMethod().toUpperCase() + " " + request.getRequestURI() + " accessed");
        artService.update(art, artid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    //CREATE
    //http://localhost:2222/art/art
    @PostMapping(value = "/art",
            consumes = {"application/json"})
    public ResponseEntity<?> addNewArt(
            @Valid
            @RequestBody Art newArt){
        newArt = artService.save(newArt);
        HttpHeaders responseHeader = new HttpHeaders();
        URI newCustomerUri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newArt.getArtid())
                .toUri();
        responseHeader.setLocation(newCustomerUri);

        return new ResponseEntity<>(null, responseHeader, HttpStatus.CREATED);
    }

}
