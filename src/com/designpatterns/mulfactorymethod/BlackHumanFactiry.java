package com.designpatterns.mulfactorymethod;

public class BlackHumanFactiry extends AbstractHumanFactory {

	@Override
	public BlackHuman createHuman() {
		return new BlackHuman();
	}

}
