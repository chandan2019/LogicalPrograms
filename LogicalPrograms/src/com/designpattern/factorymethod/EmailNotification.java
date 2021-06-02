package com.designpattern.factorymethod;

public class EmailNotification implements Notification{

	@Override
	public void notifyUser(String name) {
		
		System.out.println("email " + name);
		
	}

}
