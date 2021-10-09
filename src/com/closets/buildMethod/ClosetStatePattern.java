package com.closets.buildMethod;

public class ClosetStatePattern {

	public static void main(String[] args) {
		
		ClosetBuilder supplyCloset = new SupplyCloset();
		Closet closet = supplyCloset.fixDoors().fixDryWallScrews().construct();
		closet.addDrywall();
		closet.addStuds();
		closet.addWallFraming();		
		
		
		System.out.println("");
		ClosetContext context = new ClosetContext();
		context.open();
		context.close();
		context.broken();
		context.fixed();
		
	}

}
