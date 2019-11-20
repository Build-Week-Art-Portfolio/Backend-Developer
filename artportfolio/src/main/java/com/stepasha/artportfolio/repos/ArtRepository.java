package com.stepasha.artportfolio.repos;

import com.stepasha.artportfolio.models.Art;
import org.springframework.data.repository.CrudRepository;

//TODO 35 make a repo for art

public interface ArtRepository extends CrudRepository<Art, Long> {

    Art findByArtid(long artid);

}
