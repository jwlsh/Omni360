package org.healthnow.o360.repository;

import org.healthnow.o360.domain.event.Claim;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ClaimRepository extends GraphRepository<Claim>{

}
