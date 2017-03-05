package com.dylan.java.inner;

import java.util.Observable;

public class InternetBarManager extends Observable{
	private int money;
	
	public void recharge(int money) {
		this.money = money;
		//设置状态改变
		setChanged();
		//通知其他对象
		notifyObservers();
	}
	
	public int getMoney() {
		return money;
	}
}
