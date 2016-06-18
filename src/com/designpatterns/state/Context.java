package com.designpatterns.state;
/**
 * @author 杨峻鹏
 * @version 创建时间：2016年4月14日 上午11:44:45
 * 类说明：Alljava
 */
public class Context {
	public final static OpenState openState = new  OpenState();
	public final static CloseState closeState = new  CloseState();
	public final static RunState runState = new  RunState();
	public final static StopState stopState = new  StopState();
	public final static NOPowerState nOPowerState = new  NOPowerState();
	private State state;

	public void run() {
		this.state.run();
	}
	
	public void stop() {
		this.state.stop();
	}
	
	public void open() {
		this.state.open();
	}
	
	public void close() {
		this.state.close();
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
		this.state.setContext(this);
	}

}
