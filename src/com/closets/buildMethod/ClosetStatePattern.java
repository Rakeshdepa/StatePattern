package com.closets.buildMethod;

public class ClosetStatePattern {

	public static void main(String[] args) {
		
		Context context = new Context();
		
		OpenStatus openStatus = new OpenStatus();
		openStatus.doAction(context);
		
		System.out.println(context.getStatus().toString() + "\n");
		
		
		CloseStatus closedStatus = new CloseStatus();
		closedStatus.doAction(context);
		

		System.out.println(context.getStatus().toString());

	}

}
