package com.designpatterns.proxyforced;

public class GamePlayer implements IGamePlayer {
	private String name="";
	private IGamePlayer proxy;

	public GamePlayer(String name) {
		this.name=name;
	}

	@Override
	public void login(String name, String password) {
		if (this.isProxy()) {
			System.out.println("用户名为："+name+"的用户,"+this.name+"登录了！");
		}else {
			System.out.println("请使用制定的代理！");
		}
	}

	@Override
	public void killBoss() {
		if (this.isProxy()) {
			System.out.println(this.name+"正在打怪！");
		}else {
			System.out.println("请使用制定的代理！");
		}
	}

	@Override
	public void upgrade() {
		if (this.isProxy()) {
			System.out.println(this.name+"升一级！");
		}else {
			System.out.println("请使用制定的代理！");
		}
	}

	@Override
	public IGamePlayer getProxy() {
		if(this.proxy==null){
			this.proxy=new GamePlayerProxy(this);
		}
		return this.proxy;
	}

	private boolean isProxy(){
		if(this.proxy==null){
			return false;
		}else {
			return true;
		}
	}
}
