package com.designpattern.factorymethod;

public class TestFactory {

	public static void main(String[] args) {

		
		Notification createNotification = NotificationFactory.createNotification("sms");
		createNotification.notifyUser("chandan");
	}

}
