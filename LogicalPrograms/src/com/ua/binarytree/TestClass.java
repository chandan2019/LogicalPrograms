package com.ua.binarytree;

public class TestClass {
	
	public static class TestRef{
		
		Integer a;
		int b;
		
		TestRef(Integer a, int b){
			
			this.a = a;
			this.b = b;
		}
		
		public  void getRef(TestRef t) {
			
			t.a = a+10;
			t.b = b+20;
			
		}
		
		
	}

	public static void main(String[] args) {

		TestRef t = new TestRef(10, 20);
		System.out.println(t.a);
		System.out.println(t.b);
		
		t.getRef(t);
		
		System.out.println(t.a);
		System.out.println(t.b);
		
	}

}
