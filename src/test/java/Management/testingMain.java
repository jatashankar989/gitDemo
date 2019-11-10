package Management;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.EmailPage;
import pageObject.HomePage;
import resources.base;

public class testingMain extends base {
	
 public static Logger log =LogManager.getLogger(base.class.getName());
   
 @BeforeTest	
   public void Initialise() throws IOException {
   driver = initialise();
   log.info("Successfully Initialising the Driver");
   }
    @Test(dataProvider = "innerValue")
	    public void initbrowser(String URL, String Uname, String Password) throws IOException {
	    driver.get(URL);
		HomePage hp = new HomePage(driver);
		Assert.assertEquals(hp.text().getText(), "FEATURED COURSES");
		hp.log().click();
		EmailPage ep = new EmailPage(driver);
		ep.email().sendKeys(Uname);
		log.info("Successfully Entering the User Name");
		ep.pwd().sendKeys(Password);
		log.info("Successfully Entering the Password");
		ep.btn().click();
		log.info("Successfully Click the Button");
	}
    	@DataProvider
    	public Object[][] innerValue() {
		Object[][] data = new Object[1][3];
		data[0][0] = "http://www.qaclickacademy.com";
		data[0][1] = "Jatashankar989@gmailcom";
		data[0][2] = "Jaibabaji";
		
		return data;
	}
	    @AfterTest
	    public void close() {
        driver.close();
        driver = null;
	}

}
