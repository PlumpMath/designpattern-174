package com.designpatterns.abstractfactorymethod;

public class FemaleHumanFactiry extends AbstractHumanFactory {

	@Override
	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}

	@Override
	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

	@Override
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}


}
