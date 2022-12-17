package ittbd.WebAutoXM1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Q4_JavaScriptAlerts extends Base {

	@Test(priority = 0)
	public void OpenUrl() throws InterruptedException {

		driver.get(AlertsUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void Alerts() throws InterruptedException {
		
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		SoftAssert softAssert = new SoftAssert();
		
		
		// JS Alert with Soft Assertion------------------------
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String resultText1 = result.getText();
		softAssert.assertEquals(resultText1, "You clicked");

		
		// JS Confirm with Hard Assertion------------------------
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		String resultText2 = result.getText();
		Assert.assertEquals(resultText2, "You clicked: Cancel");

		
		// JS Prompt---------------------------
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		driver.switchTo().alert().sendKeys("Hi, I am Sadi from IT Training BD Batch 13");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		
		softAssert.assertAll();

	}

}
