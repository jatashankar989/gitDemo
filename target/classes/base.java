package resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public static WebDriver driver;
	public WebDriver initialise() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Jata\\MavenProject\\src\\main\\java\\resources\\driven.properties");
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		String UR = prop.getProperty("url");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jata\\Downloads\\chromedriver.exe");
		     driver = new ChromeDriver();
		}
		
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jata\\Downloads\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if (browserName.equals("IE"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jata\\Downloads\\chromedriver.exe");
		    driver= new InternetExplorerDriver();
		}		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		}
	public void getscreenShots(String result) throws IOException
	{
    	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src, new File("C:\\Users\\Jata\\test\\screenshot.png"));
         }
	
	
}
