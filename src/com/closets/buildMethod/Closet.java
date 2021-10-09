package com.closets.buildMethod;

import java.util.List;

public class Closet {
	
	String name;
	List<String> parts;
	
	void addParts(List<String> parts) {
		this.parts = parts;
	}
 
	void addWallFraming() {
		System.out.println("Build the Closet Wall Framing");
	}
	
	void addStuds() {
		System.out.println("Install Header and Cripple Studs");
	}
	
	void addDrywall() {
		System.out.println("Cut Wood, Install Drywall and  Install Corner Bead");
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
