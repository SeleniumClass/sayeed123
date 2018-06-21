package com.usa.ttjob;

public class ClassTest {

	public static void handle() {
		System.out.println("this is hndle");
	}
	public void wheel() {
		System.out.println("hello");
	}
	
	
	public static int x(){
		System.out.println("hello world");
		return 0;
	}

public static void main(String[] args) {
	System.out.println("this is sayeed");
	handle();
	
	ClassTest obj = new ClassTest();
    obj. wheel();
      x();
}

}

