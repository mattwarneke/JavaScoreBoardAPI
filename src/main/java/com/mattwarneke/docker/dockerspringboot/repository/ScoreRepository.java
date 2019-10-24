package com.mattwarneke.docker.dockerspringboot.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.mattwarneke.docker.dockerspringboot.model.Score;

public class ScoreRepository implements IScoreRepository {
    List<Score> allScores = new ArrayList<Score>();

    HashMap<String, List<Score>> userScores = new HashMap<String, List<Score>>();

    public void addScore(Score score) {
        allScores.add(score);

        if (userScores.containsKey(score.user)) {
            userScores.get(score.user).add(score);
        } else {
            userScores.put(score.user, new ArrayList<Score>(Arrays.asList(score)));
        }
    }

    public List<Score> findAll() {
        return allScores;
    }

    public List<Score> findAllByUser(String user) {
        if (!userScores.containsKey(user)) {
            return new ArrayList<Score>();
        }
        return userScores.get(user);
    }
}