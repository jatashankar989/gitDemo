package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailPage {
	
	public WebDriver driver;
	
	By email = By.xpath("//input[@id='user_email']");
	By pwd = By.xpath("//input[@id='user_password']");
	By btn = By.xpath("//input[@name='commit']");
	

	
	
	public EmailPage(WebDriver driver) 
	{
		this.driver=driver;
	}


	public WebElement email()
	{
		return driver.findElement(email);
	}
		public WebElement pwd()
	{
		return driver.findElement(pwd);
	}
		public WebElement btn()
	{
		return driver.findElement(btn);
	}
		
		public WebElement btn1()
		{
			return driver.findElement(btn);
		}
		public WebElement btn2()
		{
			return driver.findElement(btn);
		}

}
