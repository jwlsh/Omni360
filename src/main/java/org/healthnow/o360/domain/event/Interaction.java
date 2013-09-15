package org.healthnow.o360.domain.event;

import java.sql.Timestamp;

import org.healthnow.o360.domain.BaseEntity;
import org.healthnow.o360.domain.location.Location;
import org.healthnow.o360.domain.party.Party;
import org.springframework.data.neo4j.annotation.EndNode;
import org.springframework.data.neo4j.annotation.RelationshipEntity;
import org.springframework.data.neo4j.annotation.RelationshipType;
import org.springframework.data.neo4j.annotation.StartNode;

@RelationshipEntity
public class Interaction extends BaseEntity {
	
	@RelationshipType private String type;
	@StartNode private Party firstParty;
	@EndNode private Party secondParty;
	private Timestamp time;
	private Location place;	
	private String description;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public Location getPlace() {
		return place;
	}
	public void setPlace(Location place) {
		this.place = place;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
