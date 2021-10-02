package com.closets.buildMethod;

public class OpenStatus implements Status {

	public void doAction(Context context) {
		System.out.println("The Closet is in Open Status");
		context.setStatus(this);

	}

	public String toString() {
		return "Take all your belongings as the Closet is in Open Status";
	}

}
