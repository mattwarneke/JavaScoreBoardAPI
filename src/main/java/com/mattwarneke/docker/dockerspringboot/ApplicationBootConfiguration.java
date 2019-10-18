package com.mattwarneke.docker.dockerspringboot;

import java.io.File;

import com.coxautodev.graphql.tools.SchemaParser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.TypeDefinitionRegistry;

@SpringBootApplication
public class ApplicationBootConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationBootConfiguration.class, args);
	}
	
	// @Bean
    // GraphQLSchema schema() {
	// 	SchemaParser schemaParser = new SchemaParser();
	// 	SchemaGenerator schemaGenerator = new SchemaGenerator();

	// 	File schemaFile1 = loadSchema("starWarsSchemaPart1.graphqls");
	// 	// File schemaFile2 = loadSchema("starWarsSchemaPart2.graphqls");
	// 	// File schemaFile3 = loadSchema("starWarsSchemaPart3.graphqls");

	// 	TypeDefinitionRegistry typeRegistry = new TypeDefinitionRegistry();

	// 	// each registry is merged into the main registry
	// 	typeRegistry.merge(schemaParser.parse(schemaFile1));
	// 	// typeRegistry.merge(schemaParser.parse(schemaFile2));
	// 	// typeRegistry.merge(schemaParser.parse(schemaFile3));

	// 	GraphQLSchema graphQLSchema = schemaGenerator.makeExecutableSchema(typeRegistry, buildRuntimeWiring());
	// }

	// private RuntimeWiring buildRuntimeWiring() {
    //     return RuntimeWiring.newRuntimeWiring()
    //             .type("Query", typeWiring -> typeWiring
    //             .dataFetcher("allBooks", allBooksDataFetcher)
    //             .dataFetcher("book", bookDataFetcher))
    //              build();
    // }

    // @Bean
    // GraphQLSchema schema() {
    //     return GraphQLSchema.newSchema()
    //         .query(GraphQLObjectType.newObject()
    //             .name("query")
    //             .field(field -> field
    //                 .name("test")
    //                 .type(Scalars.GraphQLString)
    //                 .dataFetcher(environment -> "response")
    //             )
    //             .build())
    //         .build();
    // }
}
