package com.designpatterns.chainofresponsibility;

import java.util.ArrayList;
import java.util.Random;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		Father f = new Father();
		Son s = new Son();
		Husband h = new Husband();

		f.setNextHander(h);
		h.setNextHander(s);

		ArrayList<Women> al = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
			al.add(new Women(random.nextInt(4), "我要逛街"));
		}
		for (Women Women : al) {
			f.handleMessage(Women);
		}
//		Random random = new Random();
//		for (int i = 0; i < 5; i++) {
//			int level = random.nextInt(4);
//			new Thread(new runable(level,f)).start();
//		}
	}
}
class runable implements Runnable{

	private int level;
	private Father f;

	public runable(int level, Father f) {
		this.level=level;
		this.f=f;
	}

	@Override
	public synchronized void run() {
		Women m =new Women(level, "我要逛街");
		f.handleMessage(m);
	}
	
}