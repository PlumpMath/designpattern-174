package com.designpatterns.state;

/**
 * @author 杨峻鹏
 * @version 创建时间：2016年4月14日 上午11:48:11 类说明：Alljava
 */
public class OpenState extends State {

	@Override
	public void open() {
		System.out.println("电梯正在开门！");

	}

	@Override
	public void close() {
		super.context.setState(Context.closeState);
		super.context.getState().close();
	}

	@Override
	public void run() {
		System.out.println("请关门");

	}

	@Override
	public void stop() {

	}

	@Override
	public void noPower() {

	}

}
