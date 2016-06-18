package com.designpatterns.memento.clone;

/**
 * @author WSYW126
 * @version 2016年5月6日下午9:23:52
 */
public class Originator implements Cloneable {
	private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void restoreMemento(Originator memento) {
		this.setState(memento.getState());
	}

	public Originator createMemento() {
		return (Originator) this.clone();
	}

	@Override
	public Originator clone() {
		try {
			return (Originator) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
