package com.designpatterns.abstractfactorymethod;

public class MaleHumanFactiry extends AbstractHumanFactory {

	@Override
	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

	@Override
	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

	@Override
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}


}
