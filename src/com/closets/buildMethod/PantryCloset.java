package com.closets.buildMethod;

public class PantryCloset implements State {

	public void open() {
		System.out.println("This Pantry room closet is in open status and it has all the food items");		
	}

	public void closed() {
		System.out.println("This door needs to be closed");
		
	}

	public void broken() {
		System.out.println("Not applicable");
		
	}

	public void fixed() {
		System.out.println("This doesn't needs to be fixed as this is a newly built closet");
		
	}

}
