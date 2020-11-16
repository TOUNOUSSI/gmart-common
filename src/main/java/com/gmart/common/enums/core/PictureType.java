package com.gmart.common.enums.core;

public enum PictureType {

	PROFILE_PICTURE("PP"),
	COVER_PICTURE("CP");
	private String type;
	
	public String getType() {
		return this.type;
	}
	
	private PictureType(String type) {
	this.type = type;	
	}
}
