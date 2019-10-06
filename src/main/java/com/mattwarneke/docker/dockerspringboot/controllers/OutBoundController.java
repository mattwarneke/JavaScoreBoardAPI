package com.mattwarneke.docker.dockerspringboot.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mattwarneke.docker.dockerspringboot.model.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/outbound")
public class OutBoundController {

    @GetMapping()
    public String outboundscore() {
        return CreateAwsScore();
    }

    public static String CreateAwsScore()
    {
        final String uri = "http://localhost:8085/score/scoreobject";

        RestTemplate restTemplate = new RestTemplate();
        //Integer result = restTemplate.postForObject(uri, "", Integer.class);
        
        // should perhaps use a DTO here instead and then map to score...
        //Score result = restTemplate.getForObject(uri, Score.class);
        
        String result = restTemplate.getForObject(uri, String.class);
        //ObjectMapper mapper = new ObjectMapper();
        //Score score = mapper.readValue(result, Score.class);

        return result;
    }

}