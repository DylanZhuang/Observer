package com.dylan.java.inner;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof InternetBarManager) {
			InternetBarManager manager = (InternetBarManager)o;
			System.out.println(name + " 充值" + manager.getMoney() + "元成功");
		}
	}
}
