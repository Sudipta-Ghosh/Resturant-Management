package com.java.ResturantMgmt.dto.util;

public abstract class GenericDTO {

	private String action = null;
	private String event = null;
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getAction() {
		return action;
	}

}
