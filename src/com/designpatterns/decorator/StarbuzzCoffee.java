package com.designpatterns.decorator;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso(0);
		System.out.println(beverage.getDescription() + "$" +beverage.cost());
		
		Beverage beverage2 = new DaikRoast(1);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + "$" +beverage.cost());
		
		Beverage beverage3 = new Espresso(1);
		System.out.println(beverage3.getDescription() + "$" +beverage3.cost());
		

	}

}
