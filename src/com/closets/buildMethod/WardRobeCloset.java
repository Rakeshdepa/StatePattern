package com.closets.buildMethod;

public class WardRobeCloset implements State {

	public void open() {
		System.out.println("This WardRobe closet is not in open status");		
	}

	public void closed() {
		System.out.println("This is in closed status and needs to be opened to use any of the clothes stored here");
		
	}

	public void broken() {
		System.out.println("Not Broken");
		
	}

	public void fixed() {
		System.out.println("This is not applicable to this closet");
		
	}
	
}
