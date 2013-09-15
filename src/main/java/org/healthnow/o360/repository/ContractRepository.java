package org.healthnow.o360.repository;

import org.healthnow.o360.domain.contract.Contract;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;

public interface ContractRepository  extends GraphRepository<Contract> {
	
	@Query("start contract=node:Contract(contractId={0}) return contract")
	public Contract findByContractId( String contractId );
	
}
