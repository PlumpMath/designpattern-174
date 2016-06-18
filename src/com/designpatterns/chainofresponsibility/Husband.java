package com.designpatterns.chainofresponsibility;

public class Husband extends Handler {

	public Husband() {
		super(Handler.HUSBAND_LEVEL_REQUEST);
	}

	@Override
	protected void response(Women women) {
		System.out.println("--------------妻子向丈夫请示-----------------");
		System.out.println(women.getRequest());
		System.out.println("丈夫的回复是：同意");
	}

}
