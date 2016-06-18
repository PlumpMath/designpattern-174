package com.designpatterns.builder;

import java.util.ArrayList;

public abstract class CarModle {
	private ArrayList<String> al = new ArrayList<>();

	protected abstract void start();

	protected abstract void stop();

	protected abstract void alarm();

	protected abstract void engineBoom();

	protected void run() {
		for (int i = 0; al != null && i < al.size(); i++) {
			if(al.get(i).equals("start")){
				this.start();
			}else if (al.get(i).equals("stop")) {
				this.stop();
			}else if (al.get(i).equals("alarm")) {
				this.alarm();
			}else if (al.get(i).equals("engineBoom")) {
				this.engineBoom();
			}else {
				System.out.println("The car not have this function!");
			}
		}
	}

	public void setAl(ArrayList<String> al) {
		this.al = al;
	}
}
