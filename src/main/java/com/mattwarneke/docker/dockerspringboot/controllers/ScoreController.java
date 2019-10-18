package com.mattwarneke.docker.dockerspringboot.controllers;

import java.util.Date;
import java.util.List;

import com.mattwarneke.docker.dockerspringboot.model.Score;
import com.mattwarneke.docker.dockerspringboot.repository.IScoreRepository;
import com.mattwarneke.docker.dockerspringboot.repository.ScoreRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/scores")
public class ScoreController {

    IScoreRepository scoreRepository = new ScoreRepository();

    @PostMapping("/scoreInt")
    public void score(@PathVariable Integer lastscore) {
        scoreRepository.addScore(new Score(lastscore, "-", new Date(), "-", ""));
    }

    @GetMapping("/score")
    public List<Score> score() {
        return scoreRepository.findAll();
    }
   
    @PostMapping("/score")
    public void score(@RequestBody Score score) {
        scoreRepository.addScore(score);
    }

    // @PostMapping("/employees")
//     @GetMapping("/employees")
//   List<Employee> all() {
//     return repository.findAll();
//   }

//   @PostMapping("/employees")
//   Employee newEmployee(@RequestBody Employee newEmployee) {
//     return repository.save(newEmployee);
//   }

//   @GetMapping("/employees/{id}")
//   Employee one(@PathVariable Long id) {

//     return repository.findById(id)
//       .orElseThrow(() -> new EmployeeNotFoundException(id));
//   }

//   @PutMapping("/employees/{id}")
//   Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id)
}