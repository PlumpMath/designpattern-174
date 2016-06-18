package com.designpatterns.proxy;

public class Client {

	public static void main(String[] args) {
		IGamePlayer zs = new GamePlayer("张三");
		IGamePlayer proxy = new GamePlayerProxy(zs);
		proxy.login("zhangsan", "123456");
		proxy.killBoss();
		proxy.upgrade();

	}
}
