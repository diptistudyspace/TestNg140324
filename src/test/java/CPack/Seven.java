package CPack;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Seven {
	
	@BeforeTest
	public void BeforeTestDemoClass2() {
		System.out.println("This will executed before every test module in the testng.xml file No=2");
	}

	@Test
	public void testSeven() {
		System.out.println("Test Seven Got Executed");
	}
}
