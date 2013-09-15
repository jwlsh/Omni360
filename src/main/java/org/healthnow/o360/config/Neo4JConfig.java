package org.healthnow.o360.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.rest.SpringRestGraphDatabase;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Configuration
@ComponentScan(basePackages = { "org.healthnow.o360" })
@EnableNeo4jRepositories(basePackages="org.healthnow.o360.repository")
public class Neo4JConfig extends Neo4jConfiguration {
	
    private static final String DB_PATH = "http://localhost:7474/db/data";
    
    @Bean
    public SpringRestGraphDatabase graphDatabaseService() {
        return new SpringRestGraphDatabase(DB_PATH);
    }
}
