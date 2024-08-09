package com.project.sustainability.controller.suppliercontroller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.project.sustainability.dto.Input;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Slf4j
public class GoalsController {
    @Autowired
  //  EQuestion1Repo eQuestion1Repo;

    @PostMapping("/addEnergyData")
    public ResponseEntity<String> addEnergyData(@RequestBody Input input) throws JsonProcessingException {
      //  ObjectMapper mapper=new ObjectMapper();
//        Input json=mapper.readValue(input,Input.class);

        log.info("Fetching Goal Id:"+input.getGoalId());
        return ResponseEntity.ok("Success");
    }
}
