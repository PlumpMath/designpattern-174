package com.designpatterns.state;
/**
 * @author 杨峻鹏
 * @version 创建时间：2016年4月14日 上午11:49:15
 * 类说明：Alljava
 */
public class CloseState extends State {

	public CloseState() {
		
	}

	@Override
	public void open() {
		super.context.setState(Context.openState);
		super.context.getState().open();;

	}

	@Override
	public void close() {
		System.out.println("正在关门！");

	}

	@Override
	public void run() {
		super.context.setState(Context.runState);
		super.context.getState().run();

	}

	@Override
	public void stop() {
		super.context.setState(Context.stopState);
		super.context.getState().stop();

	}

	@Override
	public void noPower() {
		

	}

}
