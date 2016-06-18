package com.designpatterns.simplefactory;

public class NvWa {

	public static void main(String[] args) {
		System.out.println("----------------White People---------------");
		Human whiteHuman = HumanFactiry.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("----------------Black People---------------");
		Human blackHuman = HumanFactiry.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("----------------Yellow People---------------");
		Human YellowHuman = HumanFactiry.createHuman(YellowHuman.class);
		YellowHuman.getColor();
		YellowHuman.talk();
	}

}
