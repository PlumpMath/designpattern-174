package com.designpatterns.builder;

import java.util.ArrayList;

public class Director {
	private BenzBuilder benzBuilder = new BenzBuilder();
	private HummerBuilder hummerBuilder = new HummerBuilder();
	private ArrayList<String> sequence = new ArrayList<>();

	public BenzModle getbBenzModle() {
		this.sequence.clear();
		this.sequence.add("start");
		this.sequence.add("stop");

		this.benzBuilder.setSequence(sequence);
		return (BenzModle) this.benzBuilder.getCarModle();
	}

	public HummerModle gethHummerModle() {
		this.sequence.clear();
		this.sequence.add("engineBoom");
		this.sequence.add("start");
		this.sequence.add("stop");

		this.hummerBuilder.setSequence(sequence);
		return (HummerModle) this.hummerBuilder.getCarModle();
	}
}
