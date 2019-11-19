package com.stepasha.artportfolio.repos;

import com.stepasha.artportfolio.models.Art;
import org.springframework.data.repository.CrudRepository;

public interface ArtRepository extends CrudRepository<Art, Long> {

   // Art findArtById(long artid);

}
