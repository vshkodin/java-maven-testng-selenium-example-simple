package src.SimpleTest;


import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTest {

	 @Test()
	 public void aFastTest() {

	  	// Optional. If not specified, WebDriver searches the PATH for chromedriver.
	    System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.google.com/");
	    driver.quit();

  		}
}
