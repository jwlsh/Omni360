package org.healthnow.o360.domain.event;

import org.healthnow.o360.domain.BaseEntity;
import org.healthnow.o360.domain.party.Party;
import org.springframework.data.neo4j.annotation.RelatedTo;

public class ClaimLine extends BaseEntity {
	
	Claim claim;
	Double amount;
	@RelatedTo(type="RENDERING_PROVIDER") Party renderer;
	
	public Claim getClaim() {
		return claim;
	}
	public void setClaim(Claim claim) {
		this.claim = claim;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}		

}
