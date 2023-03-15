package org.di.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class InkBean  implements Serializable {

	private String colour;
	
	public InkBean() {
		System.out.println(this.getClass().getSimpleName()+" object created");
	}
	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void providingInk() {
		System.out.println("Providing "+colour+" ink for pen");
	}
}
