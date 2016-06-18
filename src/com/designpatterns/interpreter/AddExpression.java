package com.designpatterns.interpreter;

import java.util.HashMap;

/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月8日 下午5:05:49
 * 类说明：Alljava
 */
public class AddExpression extends SymbolExpression {

	public AddExpression(AbstractExpression left, AbstractExpression right) {
		super(left, right);
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var)+super.right.interpreter(var);
	}

}
