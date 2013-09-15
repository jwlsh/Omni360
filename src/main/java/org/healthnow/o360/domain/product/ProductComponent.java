package org.healthnow.o360.domain.product;

import java.util.Date;

import org.healthnow.o360.domain.BaseEntity;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.RelatedTo;

public class ProductComponent extends BaseEntity{
	
	@RelatedTo(type = "PRODUCT")
	private Product product;
	@Indexed private String typeOfComponent;
	private Date startDate;
	private Date endDate;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getTypeOfComponent() {
		return typeOfComponent;
	}
	public void setTypeOfComponent(String typeOfComponent) {
		this.typeOfComponent = typeOfComponent;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
