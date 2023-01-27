package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FirstTestNG {
	WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("userName")).sendKeys("Anjali Dhawan");
	  driver.findElement(By.id("userEmail")).sendKeys("xyz@gmail.com");
		
		WebElement cAddress= driver.findElement(By.id("currentAddress"));
		cAddress.sendKeys("123, Road1, Street2");
		
		String currAdd = cAddress.getText();
		//Action
		Actions actions = new Actions(driver);
		
		//Press Ctrl + a
		
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
			
		//Press Ctrl + c
		
		actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		actions.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		WebElement pAddress = driver.findElement(By.id("permanentAddress"));
		String permAdd = pAddress.getText();
		
		/*
		if (currAdd.equals(permAdd))
		{
			System.out.println("Pass");
		}
		*/
		
		Assert.assertEquals(currAdd, permAdd);
  }
  @BeforeTest
  public void beforeTest() {
	  	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
		driver.quit();
  }
  

}
