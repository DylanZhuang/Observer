package com.dylan.java.inner;

public class Main {
	public static void main(String[] args) {
		InternetBarManager manager = new InternetBarManager();
		
		Person person = new Person("dylan");
		
		System.out.println("dylan 进行上机操作");
		manager.addObserver(person);
		System.out.println("此时观察列表大小为："+manager.countObservers());
		
		manager.recharge(5);
		
		System.out.println("dylan 进行下机操作");
		manager.deleteObserver(person);
		System.out.println("此时观察列表大小为："+manager.countObservers());
	}
}
