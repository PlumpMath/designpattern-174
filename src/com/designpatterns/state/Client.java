package com.designpatterns.state;
/**
 * @author 杨峻鹏
 * @version 创建时间：2016年4月14日 下午12:11:48
 * 类说明：Alljava
 */
public class Client {


	public static void main(String[] args) {
		Context context = new Context();
		context.setState(new CloseState());
		context.open();
		context.run();
		context.close();
		context.run();
		context.stop();

	}

}
