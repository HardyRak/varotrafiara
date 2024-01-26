package com.cloud.varotrafiara.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.cloud.varotrafiara.model.AnnonceFavoris;

public interface AnnonceFavorisRepo extends MongoRepository<AnnonceFavoris, String> {
    
}
