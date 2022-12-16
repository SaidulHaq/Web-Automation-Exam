package ittbd.WebAutoXM1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Q2_DropDown extends Base{

	@Test(priority = 0)
	public void OpenUrl() throws InterruptedException {

		driver.get(IteraUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority = 1)
	public void SelectMethod() throws InterruptedException {
		
		WebElement country = driver.findElement(By.xpath("//body/div[1]/div[4]/div[2]/div[1]/select[1]"));
		country.click();
	    Select select = new Select(country);
	    select.selectByIndex(1);
		Thread.sleep(5000);
	}

}
