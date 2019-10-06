package com.mattwarneke.docker.dockerspringboot.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//import lombok.Data;

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
        this.Score = score;
        this.User = user;
        this.Date = date;
        this.Level = level;
        this.Version = version;
    }

    public Integer Score;

    public String User;

    public Date Date;

    public String Level;

    public String Version;
}