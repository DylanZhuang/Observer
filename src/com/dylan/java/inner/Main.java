package com.dylan.java.inner;

public class Main {
	public static void main(String[] args) {
		InternetBarManager manager = new InternetBarManager();
		
		Person person = new Person("dylan");
		
		System.out.println("dylan �����ϻ�����");
		manager.addObserver(person);
		System.out.println("��ʱ�۲��б��СΪ��"+manager.countObservers());
		
		manager.recharge(5);
		
		System.out.println("dylan �����»�����");
		manager.deleteObserver(person);
		System.out.println("��ʱ�۲��б��СΪ��"+manager.countObservers());
	}
}
