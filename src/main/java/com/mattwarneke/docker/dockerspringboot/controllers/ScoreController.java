package com.mattwarneke.docker.dockerspringboot.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mattwarneke.docker.dockerspringboot.model.Score;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/scores")
public class ScoreController {
    @PostMapping("/lastscore")
    public void lastScore(@PathVariable Integer lastscore) {
        cachedScores.add(new Score(lastscore, "-", new Date(), "-", ""));
    }

    List<Score> cachedScores = new ArrayList<Score>();

    @GetMapping("/scoreobject")
    public List<Score> scoreObject() {
        return cachedScores;
    }
   
    @PostMapping("/scoreobject")
    public void lastScoreObject(@RequestBody Score objScore) {
        this.cachedScores.add(objScore);
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