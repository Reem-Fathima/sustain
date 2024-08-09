package com.project.sustainability.repository;


import com.project.sustainability.model.goals.GoalsModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalRepo extends MongoRepository<GoalsModel,Integer> {
}
