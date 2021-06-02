package com.designpattern.factorymethod;

public class PushNotification implements Notification{

	@Override
	public void notifyUser(String name) {
		System.out.println("push " + name);
		
	}
	

}
