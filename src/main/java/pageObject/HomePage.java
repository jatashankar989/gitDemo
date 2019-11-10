package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	  public WebDriver driver;
      By Log = By.linkText("Login");
      By text= By.xpath("//div[@class='text-center']/h2");
      
   
      
   public HomePage(WebDriver driver) 
   {
	   this.driver=driver;
	    }
   
   public WebElement text()
   {
 	  return driver.findElement(text);
   }
   
  public WebElement log()  
   {
  return driver.findElement(Log);
   }

}
