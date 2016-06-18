package com.designpatterns.command;

public class LightOnCommand implements Command {
	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}

}
