package com.dylan.java.inner;

import java.util.Observable;

public class InternetBarManager extends Observable{
	private int money;
	
	public void recharge(int money) {
		this.money = money;
		//����״̬�ı�
		setChanged();
		//֪ͨ��������
		notifyObservers();
	}
	
	public int getMoney() {
		return money;
	}
}
