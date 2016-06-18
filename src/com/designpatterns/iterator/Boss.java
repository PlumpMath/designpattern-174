package com.designpatterns.iterator;

/**
 * @author WSYW126
 * @version 2016年5月6日下午6:06:13
 */
public class Boss {

	public static void main(String[] args) {
		IProject project = new Project();
		project.add("星际争霸", 10, 1000);
		project.add("超级英雄", 100, 100000);
		for (int i = 0; i < 10; i++) {
			project.add("第" + i + "个项目", i * 5, i * 10000);
		}

		IProjectIterator projectIterator = project.iterator();
		while (projectIterator.hasNext()) {
			IProject p = (IProject) projectIterator.next();
			System.out.println(p.getProjectInfo());
		}

	}

}
