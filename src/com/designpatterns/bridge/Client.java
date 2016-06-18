package com.designpatterns.bridge;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Client {

	public Client() {
		
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		ArrayList<AbstractUser> list = new ArrayList<AbstractUser>();
		Implements Himp= new HouseImpImplements();
		AbstractUser HU= new HouseUser(Himp);
		Implements SZimp= new ShanZhaiImpImplements();
		AbstractUser SZU= new ShanZhaiUser(SZimp);
		
		AbstractUser U = ShanZhaiUser.class.getDeclaredConstructor(Implements.class).newInstance(SZimp);
		Constructor<?> c[] =  Class.forName("com.designpatterns.bridge.ShanZhaiUser").getDeclaredConstructors();
		for (Constructor<?> constructor : c) {
			Class[] T = constructor.getParameterTypes();
			if (T.length==1) {
				AbstractUser U1 = (ShanZhaiUser) Class.forName("com.designpatterns.bridge.ShanZhaiUser").getConstructor(T).newInstance(SZimp);
				list.add(U1);
			}
		}
		list.add(U);
		list.add(SZU);
		list.add(HU);
		for (AbstractUser abstractUser : list) {
			System.out.println("this is :" +abstractUser.getClass().getName());
			abstractUser.request();
			System.out.println("-----------------------");
		}
		

	}

}
