package com.stepasha.artportfolio.services;

import com.stepasha.artportfolio.models.Art;

import java.util.List;

//TODO 36 art service

public interface ArtService {

    Art getArtById(long artid);

    List<Art> findAll();

    Art save(Art art);

    Art update(Art art, long artid);

    void delete(long artid);


}
