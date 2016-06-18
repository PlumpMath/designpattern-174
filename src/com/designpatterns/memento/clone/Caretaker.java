package com.designpatterns.memento.clone;

/**
 * @author WSYW126
 * @version 2016年5月6日下午9:27:49
 */
public class Caretaker {
	private Originator memento;

	public Originator getMemento() {
		return memento;
	}

	public void setMemento(Originator memento) {
		this.memento = memento;
	}

}
