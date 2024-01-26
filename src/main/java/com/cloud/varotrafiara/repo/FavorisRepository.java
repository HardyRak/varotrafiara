package com.cloud.varotrafiara.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.cloud.varotrafiara.model.Favoris;
import java.util.List;

public interface FavorisRepository extends MongoRepository<Favoris, String> {
    List<Favoris> findByIdUtilisateur(String idUtilisateur);
}
