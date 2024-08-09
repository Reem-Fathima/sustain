package com.project.sustainability.repository.energyRepo;

import com.project.sustainability.model.goals.energy.EQuestion2;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EQuestion2Repo extends MongoRepository<EQuestion2,Integer> {
}
