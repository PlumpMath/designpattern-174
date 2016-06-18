package com.designpatterns.interpreter;

import java.util.HashMap;

/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月8日 下午4:28:15
 * 类说明：Alljava
 */
public abstract class AbstractExpression {
	public abstract int interpreter(HashMap<String, Integer> var);
}
