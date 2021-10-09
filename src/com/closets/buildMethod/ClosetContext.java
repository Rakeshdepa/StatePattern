package com.closets.buildMethod;

public class ClosetContext {
		
	State coatClosetState = new CoatCloset();
	State wardRobeClosetState = new WardRobeCloset();
	State utilityClosetState = new UtilityCloset();
	State pantryClosetState = new PantryCloset();
	
	public void open() {
		pantryClosetState.open();
	}
	
	public void close() {
		wardRobeClosetState.closed();
	}
	
	public void broken() {
		utilityClosetState.broken();
	}
	
	public void fixed() {
		coatClosetState.fixed();	
	}
	
	
}
