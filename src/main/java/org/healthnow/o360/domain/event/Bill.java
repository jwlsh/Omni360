package org.healthnow.o360.domain.event;

import java.util.Set;

import org.healthnow.o360.domain.BaseEntity;
import org.healthnow.o360.domain.party.Party;
import org.springframework.data.neo4j.annotation.Fetch;
import org.springframework.data.neo4j.annotation.RelatedTo;

public class Bill extends BaseEntity {

	private Party billingParty;
	private Party billedParty;
	@Fetch @RelatedTo(type = "BILL_LINE_ITEM")
	private Set<BillLineItem> lineItems;
	private Double totalAmount;
	
	public Party getBillingParty() {
		return billingParty;
	}
	public void setBillingParty(Party billingParty) {
		this.billingParty = billingParty;
	}
	public Party getBilledParty() {
		return billedParty;
	}
	public void setBilledParty(Party billedParty) {
		this.billedParty = billedParty;
	}
	public Set<BillLineItem> getLineItems() {
		return lineItems;
	}
	public void setLineItems(Set<BillLineItem> lineItems) {
		this.lineItems = lineItems;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}
