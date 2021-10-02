package com.closets.buildMethod;

public class CloseStatus implements Status {
	
	public void doAction(Context context) {
		System.out.println("The Closet is in Closed Status");
		context.setStatus(this);

	}

	public String toString() {
		return "You cannot take any of your belongings as the Closet is in Closed Status";
	}

}
