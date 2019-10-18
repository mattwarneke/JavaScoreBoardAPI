package com.mattwarneke.docker.dockerspringboot.model;

import java.util.Date;

//import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@Data
//@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Score {
    public Score(
        Integer score,
        String user,
        Date date,
        String level,
        String version)
    {
        this.score = score;
        this.user = user;
        this.Date = date;
        this.level = level;
        this.version = version;
    }

    public Integer score;

    public String user;

    public Date Date;

    public String level;

    public String version;
}