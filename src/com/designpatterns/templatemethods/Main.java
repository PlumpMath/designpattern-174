package com.designpatterns.templatemethods;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HummerOne hummerOne = new HummerOne();
		String type = new Scanner(System.in).next();
		if(type.equals("N")){
			hummerOne.setAlarmFlag(false);
		}else{
			System.out.println("YES");
		}
		hummerOne.run();
		HummerTwo hummerTwo = new HummerTwo();
		hummerTwo.run();

	}

}
