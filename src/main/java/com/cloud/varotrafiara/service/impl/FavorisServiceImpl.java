package com.cloud.varotrafiara.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cloud.varotrafiara.repo.FavorisRepository;
import com.cloud.varotrafiara.service.FavorisService;
import com.cloud.varotrafiara.model.Favoris;
import java.util.List;

@Service
public class FavorisServiceImpl implements FavorisService{
    @Autowired
    private final FavorisRepository favorisRepository;

    @Autowired
    public FavorisServiceImpl(FavorisRepository favorisRepository) {
        this.favorisRepository = favorisRepository;
    }
    
    @Override
    public Favoris saveFavory(Favoris favoris){
        return favorisRepository.save(favoris);
    }

    @Override
    public List<Favoris> getAllFavoris() {
        return favorisRepository.findAll();
    }

    @Override
    public List<Favoris> findFavorisByUserId(String userId){
        return favorisRepository.findByIdUtilisateur(userId);
    }
}
