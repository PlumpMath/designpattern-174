package com.designpatterns.proxy;

public class GamePlayer implements IGamePlayer {
	private String name="";

	public GamePlayer(String name) {
		this.name=name;
	}

	@Override
	public void login(String name, String password) {
		System.out.println("用户名为："+name+"的用户,"+this.name+"登录了！");

	}

	@Override
	public void killBoss() {
		System.out.println(this.name+"正在打怪！");

	}

	@Override
	public void upgrade() {
		System.out.println(this.name+"升一级！");

	}

}
