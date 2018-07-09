package TestNGB9;

import org.testng.annotations.Test;

public class TestNGenabledDisabled {
	
	
	@Test(enabled=false,priority=1)
	public void myTest1(){
		System.out.println("I am in test 1");
	}
	
	@Test(enabled=true)
	public void myTest2(){
		System.out.println("I am in test 2");
	}

}
