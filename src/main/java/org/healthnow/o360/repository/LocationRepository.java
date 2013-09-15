package org.healthnow.o360.repository;

import org.healthnow.o360.domain.location.Location;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface LocationRepository extends GraphRepository<Location>{

}
