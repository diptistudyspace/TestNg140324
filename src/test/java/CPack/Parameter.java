package CPack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Parameters({ "StudentName" })
	@Test(priority = 1)
	public void StudentName(String name) {
		System.out.println("Students's Name:" + name);
	}

	@Parameters({ "SchoolName" })
	@Test(priority = 2)
	public void SchoolName(String SName) {
		System.out.println("School's Name:" + SName);
	}

	@Test(priority = 3)
	@Parameters({ "RollNO", "Class" })
	public void RollNo(int r, int c) {
		System.out.println("Roll No:" + r);
		System.out.println("Class:" + c);
	}
}
