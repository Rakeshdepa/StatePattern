package com.closets.buildMethod;

public class SupplyCloset extends ClosetBuilder{
	
	public ClosetBuilder roomType() {
		this.name = "This is Supply Closet";
		return this;
	}


	public ClosetBuilder fixDoors() {
		this.parts.add("This closet has Double Doors");
		return this;
		
	}

	public ClosetBuilder fixShims() {
		this.parts.add("This closet is built with Tapered Shims");
		return this;
		
	}

	public ClosetBuilder fixNails() {
		this.parts.add("This door/closet is fixed with Common nails");
		return this;
		
	}

	public ClosetBuilder fixDryWallScrews() {
		this.parts.add("This door/closet is fixed with W type drywall screw");
		return this;
		
	}



}
