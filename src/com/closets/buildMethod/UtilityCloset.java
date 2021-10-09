package com.closets.buildMethod;

public class UtilityCloset implements State {

	public void open() {
		System.out.println("This Utility closet is not in open status");		
	}

	public void closed() {
		System.out.println("This closet is in closed status");
		
	}

	public void broken() {
		System.out.println("This closet is broken and it cannot store any of the applicances");
		
	}

	public void fixed() {
		System.out.println("This closet needs to be fixed in order to use");
		
	}
	
}
