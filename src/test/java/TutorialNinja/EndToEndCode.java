package TutorialNinja;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EndToEndCode {
	

	@Test
	public void TestOne() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	
	//	driver.quit();//-----------------------------------------------------------------------Remove it to Run

		//Click MyAccount
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
		
		//Registration page
		driver.findElement(By.name("firstname")).sendKeys("Ashok");
		driver.findElement(By.name("lastname")).sendKeys("Sahoo");
		driver.findElement(By.name("email")).sendKeys("ashoksahoo52@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("9835698521");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.name("confirm")).sendKeys("123456");
		
		driver.findElement(By.name("newsletter")).click();
		
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
		//Account open conformation
		//conforming with success display message
		 WebElement SuccessStatus = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")); //take a variable that holds the referance
		 String SuccessStatusText=SuccessStatus.getText();
		 Assert.assertEquals(SuccessStatusText, "Your Account Has Been Created!"); //Actual, Expected- if two are match then pass
		 System.out.println(SuccessStatusText); //print Account opening status
		 
		//click for continue
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		
		//go to Desptop
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a")).click();
		
		//bying macBookAir, click on iphone
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[8]/div/div[1]/a/img")).click();
		
		//Add to cart
		driver.findElement(By.id("button-cart")).click();
		
		//go to cart
		driver.findElement(By.id("cart-total")).click();
		driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")).click();
		
		//Clear quantity
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input")).clear();	//...
		
		//Add quantity Two
		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input")).sendKeys("2");		//...
		
		//chechout
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
		
		//warning item not available
//		String wtext = driver.findElement(By.xpath("a//*[@id=\"checkout-cart\"]/div[1]")).getText();
		//Assert.assertTrue(wtext.contains("Products marked with *** are not available in the desired quantity or not in stock!"),"Text not found!");
//		System.out.println(wtext);
		
//		driver.findElement(By.xpath("a//*[@id=\"checkout-cart\"]/div[1]")).getText();
		
		System.out.println("End-to-End test Complete");
		
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}






