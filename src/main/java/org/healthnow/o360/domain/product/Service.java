package org.healthnow.o360.domain.product;

import org.healthnow.o360.domain.BaseEntity;

public class Service extends BaseEntity {

	private String type;
	private String code;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
