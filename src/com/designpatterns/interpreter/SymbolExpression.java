package com.designpatterns.interpreter;

/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月8日 下午4:33:55 类说明：Alljava
 */
public abstract class SymbolExpression extends AbstractExpression {
	protected AbstractExpression left;
	protected AbstractExpression right;

	public SymbolExpression(AbstractExpression left, AbstractExpression right) {
		this.left = left;
		this.right = right;
	}
}