package com.designpatterns.bridge;

public abstract class AbstractUser {
	private Implements imp;

	public AbstractUser(Implements imp) {
		this.imp = imp;
	}

	public void request(){
		this.imp.doString();
	}
	
	public Implements getImp() {
		return imp;
	}
}
