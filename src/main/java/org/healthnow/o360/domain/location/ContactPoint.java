package org.healthnow.o360.domain.location;

import org.healthnow.o360.domain.BaseEntity;
import org.healthnow.o360.domain.party.Party;
import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.RelationshipType;
import org.springframework.data.neo4j.annotation.StartNode;

@RelationshipEntity
public class ContactPoint extends BaseEntity {
	@StartNode private Party party;
	@EndNode private Location location;
	@RelationshipType private String type;
		
	public ContactPoint(Party party, Location location, String type) {
		super();
		this.party = party;
		this.location = location;
		this.type = type;
	}
	
	public ContactPoint(){}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Party getParty() {
		return party;
	}
	public void setParty(Party party) {
		this.party = party;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

}
