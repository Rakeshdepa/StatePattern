package com.closets.buildMethod;

public class OpenState implements ClosetState {

	@Override
	public void bedroom(Context context) {
		System.out.println("The Bedroom Closet is in Open Status");
		context.setStatus(this);
		
	}

	@Override
	public void garageRoom(Context context) {
		System.out.println("The Garage Room Closet is in Open Status");
		context.setStatus(this);
		
	}

	@Override
	public void laundryRoom() {
		System.out.println("There is an issue with LaundryRoom Closet. This Closet cannot be Opened" + "\n");
	}

}
