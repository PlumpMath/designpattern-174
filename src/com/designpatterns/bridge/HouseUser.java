package com.designpatterns.bridge;

public class HouseUser extends AbstractUser {

	public HouseUser(Implements imp) {
		super(imp);
	}
	@Override
	public void request(){
		super.request();
		super.getImp().doAnyString();
	}

}
