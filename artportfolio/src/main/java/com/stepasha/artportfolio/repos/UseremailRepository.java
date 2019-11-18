package com.stepasha.artportfolio.repos;

import com.stepasha.artportfolio.models.Useremail;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
//TODO 11b userEmail repo
public interface UseremailRepository extends CrudRepository<Useremail, Long>
{
    List<Useremail> findAllByUser_Username(String name);
}
