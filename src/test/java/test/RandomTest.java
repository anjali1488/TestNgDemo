package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RandomTest {
	
	//if we dont give priority to our functions it will pick the functions in alphabetical order
	WebDriver driver;
  @Test
  public void openBrowser() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
  }
  
  @Test
  public void accountLogin() {
	  WebElement uName = driver.findElement(By.id("username"));
      uName.sendKeys("santosh13");
      
      // Passing the password
      
      driver.findElement(By.id("password")).sendKeys("Snoopy1234");
      driver.findElement(By.cssSelector("input.login_button[value=Login]")).click();
  
}
  
  @Test
  public void closeBrowser() {
	  driver.quit();
  
}
}
