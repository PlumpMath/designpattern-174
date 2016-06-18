package com.designpatterns.composite;

/**
 * @author WSYW126
 * @version 2016年5月6日下午6:52:37
 */
public class Leaf extends Component {

	@Override
	public void doSomething() {
		System.out.println("I am leaf!");
	}

}
