package com.mattwarneke.docker.dockerspringboot.repository;

import java.util.List;

import com.mattwarneke.docker.dockerspringboot.model.Score;

public interface IScoreRepository {
    void addScore(Score score);

    List<Score> findAll();

    List<Score> findAllByUser(String user);
}