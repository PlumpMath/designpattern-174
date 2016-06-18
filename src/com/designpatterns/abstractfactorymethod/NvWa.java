package com.designpatterns.abstractfactorymethod;

public class NvWa {

	public static void main(String[] args) {
		System.out.println("----------------White MalePeople---------------");
		Human whiteHuman = (new MaleHumanFactiry()).createWhiteHuman();
		whiteHuman.getColor();
		whiteHuman.talk();
		whiteHuman.getSex();
		
		System.out.println("----------------White FemalePeople---------------");
		Human FemalewhiteHuman = (new FemaleHumanFactiry()).createWhiteHuman();
		FemalewhiteHuman.getColor();
		FemalewhiteHuman.talk();
		FemalewhiteHuman.getSex();
		
		System.out.println("----------------Black MalePeople---------------");
		Human blackHuman = (new MaleHumanFactiry()).createBlackHuman();
		blackHuman.getColor();
		blackHuman.talk();
		blackHuman.getSex();
		
		System.out.println("----------------Black FemalePeople---------------");
		Human FemaleBlackHuman = (new FemaleHumanFactiry()).createBlackHuman();
		FemaleBlackHuman.getColor();
		FemaleBlackHuman.talk();
		FemaleBlackHuman.getSex();
		
		System.out.println("----------------Yellow MalePeople---------------");
		Human YellowHuman = (new MaleHumanFactiry()).createYellowHuman();
		YellowHuman.getColor();
		YellowHuman.talk();
		YellowHuman.getSex();
		
		System.out.println("----------------Yellow FemalePeople---------------");
		Human FemaleYellowHuman = (new FemaleHumanFactiry()).createYellowHuman();
		FemaleYellowHuman.getColor();
		FemaleYellowHuman.talk();
		FemaleYellowHuman.getSex();
	}

}
