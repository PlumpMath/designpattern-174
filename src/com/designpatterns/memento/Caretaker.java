package com.designpatterns.memento;

/**
 * @author WSYW126
 * @version 2016年5月6日下午9:27:49
 */
public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}

}
