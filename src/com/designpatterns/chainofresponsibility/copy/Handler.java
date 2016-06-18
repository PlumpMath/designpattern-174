package com.designpatterns.chainofresponsibility.copy;

public abstract class Handler {
	public final static int COMMONUSER = 1;
	public final static int VIPUSER = 2;
	private Handler nextHander;
	private int level =0;
	public Handler(int level){
		this.level=level;
	}

	public final Response handleMessage(Request request){
		Response response =null;
		if(this.getHandlerLevel().equals(request.getRequestLevel())){
			response = this.echo(request);
		}else {
			if(this.nextHander!=null){
				response = this.nextHander.handleMessage(request);
			}
		}
		return response;
	}

	public void setNextHander(Handler nextHander) {
		this.nextHander = nextHander;
	}
	
	protected abstract Level getHandlerLevel();
	protected abstract Response echo(Request request);
	

}
