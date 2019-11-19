package com.stepasha.artportfolio.services;

//import com.stepasha.artportfolio.models.Art;
//import com.stepasha.artportfolio.repos.ArtRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Transactional
//@Service(value = "artService")
//public class ArtServiceImpl implements ArtService{
//
//    @Autowired
//    private ArtService artService;
//    @Autowired
//    private ArtRepository artRepository;
//
//    @Override
//    public Art getArtById(long artid) {
//        return artRepository.findArtById(artid);
//    }
//
//    @Override
//    public List<Art> findAll() {
//        List<Art> list = new ArrayList<>();
//        artRepository.findAll().iterator().forEachRemaining(list::add);
//        return list;
//    }
//
//    @Transactional
//    @Override
//    public Art save(Art art) {
//
//        Art newArt = new Art();
//        newArt.setPosteddate(art.getPosteddate());
//        newArt.setImageurl(art.getImageurl());
//        newArt.setTitle(art.getTitle());
//        newArt.setDescription(art.getDescription());
//        newArt.setArttype(art.getArttype());
//        return artRepository.save(newArt);
//    }
//    @Transactional
//    @Override
//    public Art update(Art art, long id) {
//        Art currentArt = getArtById(id);
//        if (art.getPosteddate() != null) {
//            currentArt.setPosteddate(art.getPosteddate());
//        }
//        if (art.getImageurl() != null) {
//            currentArt.setImageurl(art.getImageurl());
//        }
//        if (art.getTitle() != null) {
//            currentArt.setTitle(art.getTitle());
//        }
//        if (art.getDescription() != null) {
//            currentArt.setDescription(art.getDescription());
//        }
//        if (art.getArttype() != null) {
//            currentArt.setArttype(art.getArttype());
//        }
//        return artRepository.save(currentArt);
//    }
//
//    @Override
//    public void delete(long id) {
//        if (getArtById(id) != null){
//            artRepository.deleteById(id);
//        }
//
//    }
//}
