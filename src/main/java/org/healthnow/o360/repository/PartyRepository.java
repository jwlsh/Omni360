package org.healthnow.o360.repository;

import org.healthnow.o360.domain.party.Organization;
import org.healthnow.o360.domain.party.Party;
import org.healthnow.o360.domain.party.Person;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Component;

public interface PartyRepository extends GraphRepository<Party>{

	@Query("start party=node:Party(partyId={0}) return party")
	public Party findByPartyId( String partyId );
	
	@Query("start person=node:Person(ssn={0}) return person")
	public Person findBySSN( String partyId );
	
	@Query("start org=node:Organization(taxId={0}) return org")
	public Organization findByTaxID( String taxId );
	
}
