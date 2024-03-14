package APack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class One {
	
	@BeforeTest
	public void BeforeTestDemoClass() {
		System.out.println("This will executed before every test module in the testng.xml file");
	}

	@Test
	public void testOne() {
		System.out.println("Test One Got Executed");
	}
}