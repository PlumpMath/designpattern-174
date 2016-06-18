package com.designpatterns.chainofresponsibility.copy;

public class CommonUserHandle extends Handler {

	public CommonUserHandle(int level) {
		super(level);
	}

	@Override
	protected Level getHandlerLevel() {
		return null;
	}

	@Override
	protected Response echo(Request request) {
		// TODO Auto-generated method stub
		return null;
	}

}
