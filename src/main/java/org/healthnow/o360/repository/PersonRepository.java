package org.healthnow.o360.repository;

import org.healthnow.o360.domain.party.Person;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface PersonRepository extends GraphRepository<Person>{

}
