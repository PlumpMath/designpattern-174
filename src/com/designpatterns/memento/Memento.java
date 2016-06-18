package com.designpatterns.memento;

/**
 * @author WSYW126
 * @version 2016年5月6日下午9:25:11
 */
public class Memento {
	private String state = "";

	public Memento(String state) {
		this.setState(state);
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
