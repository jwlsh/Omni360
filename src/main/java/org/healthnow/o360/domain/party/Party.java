package org.healthnow.o360.domain.party;

import java.util.Set;

import org.healthnow.o360.domain.BaseEntity;
import org.healthnow.o360.domain.location.ContactPoint;
import org.healthnow.o360.domain.location.Location;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public abstract class Party extends BaseEntity {
	
	@Indexed private String partyId;
	private Set<ContactPoint> contactPoints;
	
	public String getPartyId() {
		return partyId;
	}	
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}	
	public void contactAt(Location location, String type, String name ) {		
		contactPoints.add( new ContactPoint(this, location, type) );		
	}	
	public Set<ContactPoint> getContactPoints() {
		return contactPoints;
	}
	public void setContactPoints(Set<ContactPoint> contactPoints) {
		this.contactPoints = contactPoints;
	}
}
