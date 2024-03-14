package APack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Two {
	
	@AfterTest
	public void AfterTestDemoClass1() {
		System.out.println("This will executed After every test module in the testng.xml file NO=1");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Test Two Got Executed");
	}
}
