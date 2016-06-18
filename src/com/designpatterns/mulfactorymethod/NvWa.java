package com.designpatterns.mulfactorymethod;

public class NvWa {

	public static void main(String[] args) {
		System.out.println("----------------White People---------------");
		Human whiteHuman = (new YellowHumanFactiry()).createHuman();
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("----------------Black People---------------");
		Human blackHuman = (new BlackHumanFactiry()).createHuman();
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("----------------Yellow People---------------");
		Human YellowHuman = (new YellowHumanFactiry()).createHuman();
		YellowHuman.getColor();
		YellowHuman.talk();
	}

}
