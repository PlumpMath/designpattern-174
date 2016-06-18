package com.designpatterns.singleton;

import java.util.HashSet;
import java.util.Set;

public class MainMT {

	public static class runable implements Runnable{
		public Set<SingletonMultiThread> multiThreads = new HashSet<>();
		public Set<SingletonMultiThread2> multiThreads2 = new HashSet<>();
		public Set<SingletonLazyMode> LazyModes = new HashSet<>();
		
		
		@Override
		public void run() {
			SingletonMultiThread singletonMultiThread = SingletonMultiThread.getSingleton();
			SingletonMultiThread2 singletonMultiThread2 = SingletonMultiThread2.getSingleton();
			SingletonLazyMode singletonLazy = SingletonLazyMode.getSingleton();
			
			multiThreads.add(singletonMultiThread);
			multiThreads2.add(singletonMultiThread2);
			LazyModes.add(singletonLazy);
		}
		
	}
	public static void main(String[] args) {
		runable run = new runable();
		for (int i = 0; i < 1000; i++) {
			new Thread(run).start();
		}
		System.out.println("i am LazyMode"+run.LazyModes);
		System.out.println("i am multiThreads"+run.multiThreads);
		System.out.println("i am multiThreads2"+run.multiThreads2);
	}
}