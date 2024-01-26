package com.cloud.varotrafiara.service;
import com.cloud.varotrafiara.model.Favoris;
import java.util.List;

public interface FavorisService{
    Favoris saveFavory(Favoris favoris);
    List<Favoris> getAllFavoris();
    List<Favoris> findFavorisByUserId(String userId);
}