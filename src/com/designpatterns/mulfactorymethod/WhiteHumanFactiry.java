package com.designpatterns.mulfactorymethod;

public class WhiteHumanFactiry extends AbstractHumanFactory {

	@Override
	public WhiteHuman createHuman() {
		return new WhiteHuman();
	}

}
