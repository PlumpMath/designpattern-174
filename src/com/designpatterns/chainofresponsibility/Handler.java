package com.designpatterns.chainofresponsibility;

public abstract class Handler {
	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;
	private Handler nextHander;
	private int level =-1;
	public Handler(int level){
		this.level=level;
	}

	public final void handleMessage(Women women){
		if(this.level==women.getType()){
			this.response(women);
		}else {
			if(this.nextHander!=null){
				this.nextHander.handleMessage(women);
			}else {
				System.out.println("----------------------------------------");
				System.out.println("没地方请示了，不同意！");
			}
		}
	}

	protected abstract void response(Women women);
	public void setNextHander(Handler nextHander) {
		this.nextHander = nextHander;
	}
	
	

}
