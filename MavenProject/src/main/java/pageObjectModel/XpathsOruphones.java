package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathsOruphones 
{
	public static WebDriver driver;
	private By SellYourPhone = By.xpath("//a[@class=\"inline-flex items-center justify-center font-medium ring-offset-background focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 active:scale-105 transform transition-all duration-200 ease-in-out hover:scale-105 bg-brand-yellow text-primary-foreground hover:bg-yellow-400/90 py-2 h-8 rounded-sm px-2 text-center text-[11px] leading-3 xl:text-xs\"]");
	private By Brand = By.xpath("//input[@placeholder=\"Search your Mobile Phone\"]");
	private By Models = By.xpath("//div[@class=\"cursor-pointer  p-2 px-1 hover:bg-gray-100\"]");
	private By variant = By.xpath("(//button[@role=\"radio\"])[2]");
	private By confirmToGetEvaluation = By.xpath("//button[@class=\"font-medium ring-offset-background focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 active:scale-105 transform transition-all duration-200 ease-in-out hover:scale-105 bg-brand-yellow text-primary-foreground hover:bg-yellow-400/90 flex items-center justify-center gap-2 rounded-full p-6 text-lg\"]");
	private By getExactValue = By.xpath("//button[@class=\"font-medium ring-offset-background focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 active:scale-105 transform transition-all duration-200 ease-in-out hover:scale-105 bg-brand-yellow text-primary-foreground hover:bg-yellow-400/90 flex items-center justify-center gap-2 rounded-full p-6 text-base lg:text-lg\"]");
	private By checkBoxes = By.xpath("//button[@class=\"flex-col relative flex h-full w-full items-center justify-center gap-2 text-sm\"]");
	private By NextButton = By.xpath("(//button[@class=\"font-medium ring-offset-background focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 active:scale-105 transform transition-all duration-200 ease-in-out hover:scale-105 bg-brand-yellow text-primary-foreground hover:bg-yellow-400/90 mt-2 flex items-center justify-center gap-2 rounded-full p-6 text-lg lg:mt-20\"])[1]");
	private By PhoneWorkinglabel = By.xpath("(//label[@class=\"text-sm leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70 flex h-48 w-full cursor-pointer flex-col items-center justify-center gap-4 p-2 font-normal false\"])[1]");
	private By NextButton2 = By.xpath("(//button[@type=\"submit\"])[2]");
	private By PhoneConditionScreen = By.xpath("(//label[@class=\"text-sm leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70 flex h-full w-full cursor-pointer flex-col items-center justify-between gap-4 p-2 font-normal false\"])[1]");
	private By NextButton3 = By.xpath("(//button[@type=\"submit\"])[2]");
	private By PhoneConditionBody = By.xpath("(//label[@class=\"text-sm leading-none peer-disabled:cursor-not-allowed peer-disabled:opacity-70 flex h-full w-full cursor-pointer flex-col items-center justify-between gap-4 p-2 font-normal false\"])[4]");
	private By NextButton4 = By.xpath("(//button[@type=\"submit\"])[2]");




	public XpathsOruphones(WebDriver driver2) {
		this.driver = driver2;
	}




	public WebElement clickOnSellYourPhone()
	{
		return driver.findElement(SellYourPhone);
		
	}
	
	public WebElement enterBrandName()
	{
		return driver.findElement(Brand);
	}
	
	public List<WebElement> selectModel()
	{
		return driver.findElements(Models);
	}
	
	public WebElement selectVariant()
	{
		return driver.findElement(variant);
	}
	
	public WebElement clickOnConfirmToGetEvaluation()
	{
		return driver.findElement(confirmToGetEvaluation);
	}
	
	public WebElement clickOnGetExactValue()
	{
		return driver.findElement(getExactValue);
	}
	
	public List<WebElement> clickOnallCheckboxes()
	{
		return driver.findElements(checkBoxes);
	}
	
	public WebElement clickOnNextButton()
	{
		return driver.findElement(NextButton);
	}
	
	public WebElement clickOnYesWorking()
	{
		return driver.findElement(PhoneWorkinglabel);
	}
	
	public WebElement clickOnNextButton2()
	{
		return driver.findElement(NextButton2);
	}
	
	public WebElement clickOnPhoneCondition1()
	{
		return driver.findElement(PhoneConditionScreen);
	}
	
	public WebElement clickOnNextButton3()
	{
		return driver.findElement(NextButton3);
	}
	
	public WebElement clickOnPhoneCondition2()
	{
		return driver.findElement(PhoneConditionBody);
		
	}
	
	public WebElement clickOnNextButton4()
	{
		return driver.findElement(NextButton4);
	}
	
	
	
	

}
