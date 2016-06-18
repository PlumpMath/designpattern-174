package com.designpatterns.iterator;

/**
 * @author WSYW126
 * @version 2016年5月5日下午6:45:09
 */
public interface IProject {
	public void add(String name, int num, int cost);

	public String getProjectInfo();

	public IProjectIterator iterator();
}
