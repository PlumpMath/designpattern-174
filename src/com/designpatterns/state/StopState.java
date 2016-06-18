package com.designpatterns.state;
/**
 * @author 杨峻鹏
 * @version 创建时间：2016年4月14日 上午11:49:37
 * 类说明：Alljava
 */
public class StopState extends State {

	@Override
	public void open() {
		super.context.setState(Context.openState);
		super.context.getState().open();

	}

	@Override
	public void close() {

	}

	@Override
	public void run() {
		super.context.setState(Context.runState);
		super.context.getState().run();
	}

	@Override
	public void stop() {
		System.out.println("正在停止！");
	}

	@Override
	public void noPower() {
		// TODO Auto-generated method stub

	}

}
