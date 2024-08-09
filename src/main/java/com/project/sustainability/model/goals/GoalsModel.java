package com.project.sustainability.model.goals;

import com.project.sustainability.dto.Questions;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document(collection = "goalsData")
public class GoalsModel
{
    @Id
    private Integer goalId;
    private String goalType;
    private String supplierId;
    private ArrayList<Questions> questions;

}
