package oruPhones;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjectModel.XpathsOruphones;
import resources.BaseClass;

public class SellYourPhone extends BaseClass
{
	@Test
	public void syp() throws IOException, InterruptedException
	{
		driverIntitialize();
		driver.get("https://www.oruphones.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		XpathsOruphones obj = new XpathsOruphones(driver);
		obj.clickOnSellYourPhone().click();
		Thread.sleep(2000);
		obj.enterBrandName().sendKeys("OnePlus");
		Thread.sleep(2000);
		
		obj.selectModel();
		
		Thread.sleep(2000);
		
		for(int i = 0;i<obj.selectModel().size(); i++)
		{
			Thread.sleep(2000);
			System.out.println(obj.selectModel().get(i).getText());
			if(obj.selectModel().get(i).getText().equalsIgnoreCase("OnePlus 11R"))
			{
				obj.selectModel().get(i).click();
				break;
			}
			
		}
		
		Thread.sleep(2000);
		
		obj.selectVariant().click();
		Thread.sleep(1000);
		obj.clickOnConfirmToGetEvaluation().click();
		Thread.sleep(2000);
		obj.clickOnGetExactValue().click();
		Thread.sleep(2000);
		obj.clickOnallCheckboxes();
		
		for(WebElement s:obj.clickOnallCheckboxes())
		{
			s.click();
		}
		
		Thread.sleep(2000);
		obj.clickOnNextButton().click();
		
		Thread.sleep(2000);
		obj.clickOnYesWorking().click();
		Thread.sleep(2000);
		obj.clickOnNextButton2().click();
		Thread.sleep(2000);
		obj.clickOnPhoneCondition1().click();
		Thread.sleep(2000);
		obj.clickOnNextButton3().click();
		Thread.sleep(2000);
		obj.clickOnPhoneCondition2().click();
		Thread.sleep(2000);
		obj.clickOnNextButton4().click();
		Thread.sleep(2000);
		driver.quit();
	}

}
