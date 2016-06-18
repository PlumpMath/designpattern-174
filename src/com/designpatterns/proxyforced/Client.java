package com.designpatterns.proxyforced;

public class Client {
	public static void main(String[] args) {
		IGamePlayer zs = new GamePlayer("张三");
		System.out.println("-----------------------------\n错误的用法");
		IGamePlayer proxy = new GamePlayerProxy(zs);
		proxy.login("zhangsan", "123456");
		proxy.killBoss();
		proxy.upgrade();

		System.out.println("-----------------------------\n正确的用法");
		proxy = zs.getProxy();
		proxy.login("zhangsan", "123456");
		proxy.killBoss();
		proxy.upgrade();
	}
}
