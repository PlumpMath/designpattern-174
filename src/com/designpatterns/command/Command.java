package com.designpatterns.command;

public interface Command {
	public Light light = new Light();
	public void execute(); 
	public void undo(); 
}
