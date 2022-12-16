package ittbd.WebAutoXM1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class JavaScriptAlerts extends Base {

	@Test(priority = 0)
	public void OpenUrl() throws InterruptedException {

		driver.get(AlertsUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void Alerts() throws InterruptedException {
		
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));

		// JS Alert------------------------
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		String resultText = result.getText();
		Assert.assertEquals(resultText, "You successfully clicked an alert");

		
		// JS Confirm------------------------
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);

		
		// JS Alert---------------------------
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		driver.switchTo().alert().sendKeys("I AM SADI");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

	}

}
