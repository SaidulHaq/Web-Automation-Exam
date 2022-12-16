package ittbd.WebAutoXM1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Q3_RadioButtonCheckBox extends Base {
	
	@Test(priority = 0)
	public void OpenUrl() throws InterruptedException {

		driver.get(IteraUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority = 1)
	public void RadioButton() throws InterruptedException {
		
		driver.findElement(By.id("male")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	public void CheckBox() throws InterruptedException {
		
		driver.findElement(By.id("tuesday")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("friday")).click();
		Thread.sleep(3000);
		
	}

}
