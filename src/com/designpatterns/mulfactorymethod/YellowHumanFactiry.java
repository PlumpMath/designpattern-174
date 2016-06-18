package com.designpatterns.mulfactorymethod;

public class YellowHumanFactiry extends AbstractHumanFactory {

	@Override
	public YellowHuman createHuman() {
		return new YellowHuman();
	}

}
