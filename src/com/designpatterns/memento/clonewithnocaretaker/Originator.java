package com.designpatterns.memento.clonewithnocaretaker;

/**
 * @author WSYW126
 * @version 2016年5月6日下午9:23:52
 */
public class Originator implements Cloneable {
	private String state = "";

	private Originator memento=null;
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void restoreMemento() {
		this.setState(this.memento.getState());
	}

	public void createMemento() {
		this.memento=this.clone();
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
