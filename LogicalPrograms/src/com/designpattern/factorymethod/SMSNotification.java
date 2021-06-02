package com.designpattern.factorymethod;

public class SMSNotification implements Notification{

	@Override
	public void notifyUser(String name) {

		
		System.out.println("SMS " + name);
	}

}
