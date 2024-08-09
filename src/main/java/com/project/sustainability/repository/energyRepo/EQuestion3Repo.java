package com.project.sustainability.repository.energyRepo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EQuestion3Repo extends MongoRepository<EQuestion3Repo,Integer> {
}
