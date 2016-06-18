package com.designpatterns.command;

public class SimepleRemoteControl {
	private Command[] onComands;
	private Command[] offComands;
	private Command undoCommand;

	public SimepleRemoteControl() {
		onComands = new Command[7];
		offComands = new Command[7];
		
		Command noCommand = new NoCommand();
		
		for (int i = 0; i < 7; i++) {
			onComands[i] = noCommand;
			offComands[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand,  Command offCommand) {
		onComands[slot] = onCommand;
		offComands[slot] = offCommand;
	}
	
	public void onButtonWasPressed(int slot) {
		onComands[slot].execute();
		undoCommand=onComands[slot];
	}
	
	public void offButtonWasPressed(int slot) {
		offComands[slot].execute();
		undoCommand=offComands[slot];
	}
	
	public void undoButtonWasPushed(){
		undoCommand.undo();
	}
}
