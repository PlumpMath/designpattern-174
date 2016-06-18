package com.designpatterns.memento;

/**
 * @author WSYW126
 * @version 2016年5月6日下午9:23:52
 */
public class Originator {
	private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void restoreMemento(Memento memento) {
		this.setState(memento.getState());
	}

	public Memento createMemento() {
		return new Memento(this.state);
	}
}
