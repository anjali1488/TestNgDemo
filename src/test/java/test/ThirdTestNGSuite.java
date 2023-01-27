package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class ThirdTestNGSuite {
	WebDriver driver;
  @Test
  public void f() {
	  
	  WebElement uName = driver.findElement(By.id("username"));
      uName.sendKeys("santosh13");
      
      // Passing the password
      
      driver.findElement(By.id("password")).sendKeys("Snoopy1234");
      
      //
      
      //driver.findElement(By.cssSelector(".login_register")).click();
      
      //driver.findElement(By.cssSelector("#login")).click();
      
      // tag and attribute
      
      //driver.findElement(By.cssSelector("input[name=login]")).click();
      
      // using tag , class and attribute "type"
      
      //driver.findElement(By.cssSelector("input.login_button[type=submit]")).click();
      
      // using tag , class and attribute "value
      
      driver.findElement(By.cssSelector("input.login_button[value=Login]")).click();



     //Drop down - 3 methods to select the elements - LOCATION
      //new Select(driver.findElement(By.className("search_combobox"))).selectByValue("Sydney");
      //new Select(driver.findElement(By.className("search_combobox"))).selectByIndex(3);
      new Select(driver.findElement(By.className("search_combobox"))).selectByVisibleText("Melbourne");



     
      //Drop down - HOTELS
      new Select(driver.findElement(By.cssSelector("#hotels.search_combobox"))).selectByValue("Hotel Sunshine");



     //Drop down - ROOMTYPE
      new Select(driver.findElement(By.cssSelector("select[name=room_type]"))).selectByValue("Double");
      
      
      //click on Search
      driver.findElement(By.id("Submit")).click();
      
      //Radio button on next page
      driver.findElement(By.id("radiobutton_0")).click();
      
      //Click on any hyperlink above
      driver.findElement(By.linkText("Booked Itinerary")).click();
      
      driver.findElement(By.partialLinkText("Search")).click();
      
  }
  @BeforeTest
  public void beforeTest() {
	  	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://adactinhotelapp.com");
			driver.manage().window().maximize();
  }
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
