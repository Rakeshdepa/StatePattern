package com.closets.buildMethod;

public class CloseState implements ClosetState {
	

	@Override
	public void bedroom(Context context) {
		System.out.println("The Bedroom Closet is in Closed Status");
		context.setStatus(this);
		
	}

	@Override
	public void garageRoom(Context context) {
		System.out.println("The GarageRoom Closet is in Closed Status");
		context.setStatus(this);
		
	}

	@Override
	public void laundryRoom() {
		System.out.println("There is an issue with LaundryRoom Closet. This Closet cannot be Closed");
	}

}
