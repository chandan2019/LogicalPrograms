package com.deepcloning.copyconstructor;

public class TestCloning {
	
	public static void main(String args[]) {
		
		
		Address address = new Address("Downing St 10", "London", "England");
		User pm = new User("Prime", "Minister", address);
		 User deepCopy = new User(pm);
		 
		 deepCopy.getAddress().setCountry("India");
		 
		 System.out.println(address.getCountry());
		 System.out.println(deepCopy.getAddress().getCountry());
		
	}

}
