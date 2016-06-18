package com.designpatterns.composite;

import java.util.ArrayList;

/**
 * @author WSYW126
 * @version 2016年5月6日下午6:49:35
 */
public class Composite extends Component {
	private ArrayList<Component> list = new ArrayList<>();

	public void add(Component component) {
		list.add(component);
	}

	public void remove(Component component) {
		list.remove(component);
	}

	public ArrayList<Component> getChildren() {
		return this.list;
	}

	@Override
	public void doSomething() {
		System.out.println("I am branch!");
	}

}
