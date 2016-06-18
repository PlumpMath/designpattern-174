package com.designpatterns.memento.clone;

/**
 * @author WSYW126
 * @version 2016年5月6日下午9:28:22
 */
public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());
		originator.restoreMemento(caretaker.getMemento());
	}
}
