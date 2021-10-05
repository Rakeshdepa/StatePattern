package com.closets.buildMethod;

public class ClosetStatePattern {

	public static void main(String[] args) {
		
		Context context = new Context();
		
		OpenState openState = new OpenState();
		CloseState closeState = new CloseState();
		
		openState.bedroom(context);
		openState.garageRoom(context);
		openState.laundryRoom();
		
		closeState.bedroom(context);
		closeState.garageRoom(context);
		closeState.laundryRoom();
		
		
	}

}
