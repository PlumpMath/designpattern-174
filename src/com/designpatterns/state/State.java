package com.designpatterns.state;
/**
 * @author 杨峻鹏
 * @version 创建时间：2016年4月14日 上午11:44:01
 * 类说明：Alljava
 */
public abstract class State {

	protected Context context;
	public abstract void open();
	public abstract void close();
	public abstract void run();
	public abstract void stop();
	public abstract void noPower();
	
	
	public State() {
		
	}
	public Context getContext() {
		return context;
	}
	public void setContext(Context context) {
		this.context = context;
	}

}
