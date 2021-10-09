package com.closets.buildMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class ClosetBuilder {
	
	String name;
	List<String> parts = new ArrayList<String>();
	
	public abstract ClosetBuilder roomType();
	public abstract ClosetBuilder fixDoors();
	public abstract ClosetBuilder fixShims();
	public abstract ClosetBuilder fixNails();
	public abstract ClosetBuilder fixDryWallScrews();
	public Closet construct() {
		Closet closet = new Closet();
		closet.setName(this.name);
		closet.addParts(parts);
		return closet;
	}

}
