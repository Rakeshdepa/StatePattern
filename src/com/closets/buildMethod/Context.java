package com.closets.buildMethod;

public class Context {
	
	private ClosetState status;
	
	public Context() {
		status = null;
	}

	public ClosetState getStatus() {
		return status;
	}

	public void setStatus(ClosetState status) {
		this.status = status;
	}

}
