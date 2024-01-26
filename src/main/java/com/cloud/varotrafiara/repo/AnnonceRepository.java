package com.cloud.varotrafiara.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.cloud.varotrafiara.model.Annonce;
import java.util.List;

public interface AnnonceRepository extends MongoRepository<Annonce, String> {
    List<Annonce> findAnnonceByProprietaireId(String proprietaireId);
}
