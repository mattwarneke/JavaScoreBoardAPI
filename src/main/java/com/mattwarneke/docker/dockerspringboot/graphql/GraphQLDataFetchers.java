
package com.mattwarneke.docker.dockerspringboot.graphql;

import com.google.common.collect.ImmutableMap;
import graphql.schema.DataFetcher;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class GraphQLDataFetchers {
    /*
    user: String!
    score: Int!
    #date: Date
    level: String
    version: String
    */
    private static List<Map<String, String>> scores = Arrays.asList(
            ImmutableMap.of(
                "user", "matt",
                "score", "100",
                "level", "fort",
                "version", "1"),
            ImmutableMap.of(
                "user", "bob",
                "score", "50",
                "level", "easy",
                "version", "1"),
            ImmutableMap.of(
                "user", "matt",
                "score", "150",
                "level", "easy",
                "version", "1")
    );

    public DataFetcher getScoresByUserDataFetcher() {
        return dataFetchingEnvironment -> {
            String user = dataFetchingEnvironment.getArgument("user");
            List<Map<String, String>> result = scores
                    .stream()
                    .filter(score -> score.get("user").equals(user))
                    .collect(Collectors.toList());
            return result;
        };
    }

    public DataFetcher getScoresDataFetcher() {
        return dataFetchingEnvironment -> {
            return scores;
        };
    }
}