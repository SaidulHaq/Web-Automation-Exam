package ittbd.WebAutoXM1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover extends Base {

	@Test(priority = 0)
	public void OpenUrl() throws InterruptedException {

		driver.get(DarazUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority = 1)
	public void HoverTest() throws InterruptedException {
		
		Actions action = new Actions (driver);
		
		WebElement automotive = driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]"));
		action.moveToElement(automotive).perform();
		Thread.sleep(3000);
		
		WebElement motorcycle = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]"));
		action.moveToElement(motorcycle).perform();
		Thread.sleep(3000);
	
		WebElement helmet = driver.findElement(By.xpath("//span[contains(text(),'Helmet')]"));
		helmet.click();
		Thread.sleep(3000);
		
	}

}
