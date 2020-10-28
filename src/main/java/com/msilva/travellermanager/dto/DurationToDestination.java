package com.msilva.travellermanager.dto;

public class DurationToDestination {
	
	private String text;
	private Integer value;
	
	public DurationToDestination(String text, Integer value) {
		super();
		this.text = text;
		this.value = value;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}

}
