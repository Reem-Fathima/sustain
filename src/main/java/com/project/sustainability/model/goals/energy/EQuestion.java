package com.project.sustainability.model.goals.energy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class EQuestion {

    private Integer questionId;
    private Integer percentage;
    private String category;
    private Integer year;
    private String renewableResource;
    private String type;
    private Integer amountOfEnergy;
    private String goal;
}
