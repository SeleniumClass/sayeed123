package com.usa.ttjob;

import org.testng.annotations.Test;

public class TestPriority {
	
	
@Test(priority=3)

public void Fristtest() {
	
	System.out.println("this is first test");
	
}


@Test(priority=1)

public void Secondtest() {
	
	System.out.println("this is second test ");
	
}


@Test(priority=2)

public void Thirdtest() {
	
	System.out.println( "this is third test ");
}
}
