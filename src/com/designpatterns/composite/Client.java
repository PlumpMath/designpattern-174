package com.designpatterns.composite;
/**
 * @author WSYW126
 * @version 2016年5月6日下午6:52:53
 */
public class Client {

	public static void main(String[] args) {
		Composite root = new Composite();
		root.doSomething();
		Composite branch = new Composite();
		Leaf leaf = new Leaf();
		root.add(branch);
		branch.add(leaf);
		display(root);
	}

	//递归遍历树
	private static void display(Composite root) {
		for (Component c : root.getChildren()) {
			if(c instanceof Leaf){
				c.doSomething();
			}else {
				display((Composite)c);
			}
		}
		
	}
}
