package com.designpatterns.state;

/**
 * @author 杨峻鹏
 * @version 创建时间：2016年4月14日 上午11:49:26 类说明：Alljava
 */
public class RunState extends State {

	@Override
	public void open() {

	}

	@Override
	public void close() {

	}

	@Override
	public void run() {
		System.out.println("正在运行！");

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
