package com.designpatterns.mediator;

/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月8日 下午3:40:28 类说明：Alljava
 */
public abstract class Colleague {
	protected IMediator mediator;

	public Colleague(IMediator mediator) {
		this.mediator = mediator;
	}
}
