package com.designpatterns.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author 杨峻鹏
 * @version 创建时间：2016年5月8日 下午5:06:26 类说明：Alljava
 */
public class Calculator {
	private AbstractExpression AE;

	public Calculator(String expStr) {
		Stack<AbstractExpression> s = new Stack<AbstractExpression>();
		char[] chararray = expStr.toCharArray();
		AbstractExpression left = null;
		AbstractExpression right = null;
		for (int i = 0; i < chararray.length; i++) {
			switch (chararray[i]) {
			case '+':
				left = s.pop();
				right = new VarExpression(String.valueOf(chararray[++i]));
				s.push(new AddExpression(left, right));
				break;

			case '-':
				left = s.pop();
				right = new VarExpression(String.valueOf(chararray[++i]));
				s.push(new SubExpression(left, right));
				break;
			default:
				s.push(new VarExpression(String.valueOf(chararray[i])));
				break;
			}
		}
		this.AE = s.pop();
	}

	public int run(HashMap<String, Integer> var) {
		return this.AE.interpreter(var);
	}
}
