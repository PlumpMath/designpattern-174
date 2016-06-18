package com.designpatterns.interpreter;

import java.util.HashMap;

/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月8日 下午4:31:09 类说明：Alljava
 */
public class VarExpression extends AbstractExpression {
	private String key;

	public VarExpression(String key) {
		this.key = key;
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}
}
