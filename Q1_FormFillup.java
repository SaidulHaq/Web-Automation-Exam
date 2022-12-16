package ittbd.WebAutoXM1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Q1_FormFillup extends Base {
	
	@Test(priority = 0)
	public void OpenUrl() throws InterruptedException {

		driver.get(IteraUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test (priority = 1)
	public void TextArea() throws InterruptedException {

		// Name
		driver.findElement(By.id("name")).sendKeys("Admin Sadi");
		Thread.sleep(3000);

		// Mobile number
		driver.findElement(By.id("phone")).sendKeys("01300079355");
		Thread.sleep(3000);

		// Email address
		driver.findElement(By.id("email")).sendKeys("admin4sadi@gmail.com");
		Thread.sleep(3000);

		// Password
		driver.findElement(By.id("password")).sendKeys("Admin12345");
		Thread.sleep(3000);

		// Address
		driver.findElement(By.id("address")).sendKeys("12/1, Janata Housing, Ring Rd, Adabor, Dhaka.");
		Thread.sleep(3000);

		// Click Submit
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);

	}


}
