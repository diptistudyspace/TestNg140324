package CPack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Six {
	
	@AfterTest
	public void AfterTestDemoClass2() {
		System.out.println("This will executed After every test module in the testng.xml file NO=2");
	}
	
	@Test
	public void testSix() {
		System.out.println("Test Six Got Executed");
	}
}
