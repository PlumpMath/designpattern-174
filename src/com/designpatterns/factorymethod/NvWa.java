package com.designpatterns.factorymethod;

public class NvWa {

	public static void main(String[] args) {
		AbstractHumanFactory YYL = new HumanFactiry();
		System.out.println("----------------White People---------------");
		Human whiteHuman = YYL.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		System.out.println("----------------Black People---------------");
		Human blackHuman = YYL.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		System.out.println("----------------Yellow People---------------");
		Human YellowHuman = YYL.createHuman(YellowHuman.class);
		YellowHuman.getColor();
		YellowHuman.talk();
	}

}
