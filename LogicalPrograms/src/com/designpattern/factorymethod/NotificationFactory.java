package com.designpattern.factorymethod;

public class NotificationFactory {
	
	
	static Notification createNotification(String s){
		
		Notification notification = null;
		if(s.equals("sms")) {
			notification = new SMSNotification();
			
		}else if(s.equals("email")) {
			notification = new EmailNotification();
			
		}else if(s.equals("push")) {
			notification =  new PushNotification();
			
		}
		
		return notification;
	}

}
