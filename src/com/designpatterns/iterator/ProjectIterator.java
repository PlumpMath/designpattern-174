package com.designpatterns.iterator;

import java.util.ArrayList;

/**
 * @author WSYW126
 * @version 2016年5月5日下午6:43:37
 */
public class ProjectIterator implements IProjectIterator {
	private ArrayList<IProject> rs = new ArrayList<>();
	private int currentItem = 0;

	public ProjectIterator(ArrayList<IProject> rs) {
		this.rs = rs;
	}

	@Override
	public boolean hasNext() {
		boolean b = false;
		if (this.currentItem < this.rs.size()) {
			b = true;
		}
		return b;
	}

	@Override
	public IProject next() {
		return this.rs.get(currentItem++);
	}

	@Override
	public void remove() {

	}

}
