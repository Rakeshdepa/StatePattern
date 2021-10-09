package com.closets.buildMethod;

public class CoatCloset implements State {

	public void open() {
		System.out.println("This Coat closet is not in open status");		
	}

	public void closed() {
		System.out.println("This is in closed status");
		
	}

	public void broken() {
		System.out.println("This closet is broken recently and doesn't know the current status");
		
	}

	public void fixed() {
		System.out.println("This closet is fixed and is ready to be used to store jackets, hoodies, snow shoes etc");
		
	}
	
}
