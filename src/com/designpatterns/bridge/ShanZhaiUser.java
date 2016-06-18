package com.designpatterns.bridge;

public class ShanZhaiUser extends AbstractUser {

	public ShanZhaiUser(Implements imp) {
		super(imp);
	}
	@Override
	public void request(){
		super.request();
		super.getImp().doAnyString();
	}

}
