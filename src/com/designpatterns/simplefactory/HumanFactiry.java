package com.designpatterns.simplefactory;

public class HumanFactiry {

	public static <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			System.out.println("造人失败!");
		}
		return (T) human;
	}

}
