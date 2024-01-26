package com.cloud.varotrafiara.service;
import com.cloud.varotrafiara.model.Annonce;
import java.util.List;

public interface AnnonceService{
    Annonce saveAnnonce(Annonce annonce);
    List<Annonce> findAll();
    void deleteAnnonce(String idAnnonce);
    List<Annonce> findByIdUser(String idUser);
}