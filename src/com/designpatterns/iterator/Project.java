package com.designpatterns.iterator;

import java.util.ArrayList;

/**
 * @author WSYW126
 * @version 2016年5月5日下午6:49:21
 */
public class Project implements IProject {
	private ArrayList<IProject> rs = new ArrayList<>();
	private String name = "";
	private int num = 0;
	private int cost = 0;

	public Project() {
	}

	private Project(String name, int num, int cost) {
		this.name = name;
		this.num = num;
		this.cost = cost;
	}

	@Override
	public void add(String name, int num, int cost) {
		this.rs.add(new Project(name, num, cost));
	}

	@Override
	public String getProjectInfo() {
		String inf = "";
		inf = inf + "项目名称是:" + this.name;
		inf = inf + "\t项目的人数：" + this.num;
		inf = inf + "\t项目的费用：" + this.cost;
		return inf;
	}

	@Override
	public IProjectIterator iterator() {
		return new ProjectIterator(this.rs);
	}

}
