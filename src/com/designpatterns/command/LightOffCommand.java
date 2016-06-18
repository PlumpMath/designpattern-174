package com.designpatterns.command;

public class LightOffCommand implements Command {
	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
