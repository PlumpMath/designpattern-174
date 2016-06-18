package com.designpatterns.command;

public class Main {
	public static void main(String[] args) {
		SimepleRemoteControl simepleRemoteControl = new SimepleRemoteControl();
		LightOnCommand lightOnCommand = new LightOnCommand();
		LightOffCommand lightOffCommand = new LightOffCommand();

		simepleRemoteControl.setCommand(0, lightOnCommand, lightOffCommand);
		System.out.println("开灯！");
		simepleRemoteControl.onButtonWasPressed(0);
		System.out.println("关灯！");
		simepleRemoteControl.offButtonWasPressed(0);
		System.out.println("撤销上一步操作！");
		simepleRemoteControl.undoButtonWasPushed();
	}
}
