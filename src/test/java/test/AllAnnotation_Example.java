package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllAnnotation_Example {
  @Test(priority=-1)  //if we set priority then it will take priority and not alphabetical order
  public void Function1() {
	  System.out.println("Sample Text Function1");
	  Reporter.log("I am inside Function1");
  }
  //added one more function
  //run it to see the order of calls
  
  @Test(priority=0)
  public void afunction2() {
	  System.out.println("Sample Text aFunction2");
	  Reporter.log("I am inside Function2");
  }
//did not set any priority
  @Test 
  public void Function3() {
	  System.out.println("Sample Text Function3");
	  Reporter.log("I am inside Function3");
  }
  
  
  @Test(enabled=false)
  public void Function4() {
	  System.out.println("Sample Text Function4");
	  Reporter.log("I am inside Function4");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Sample Text Before");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Sample Text After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Sample Text Before Class");
  }
  

  @AfterClass
  public void afterClass() {
	  System.out.println("Sample Text After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Sample Text BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Sample Text AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Sample Text BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Sample Text AfterSuite");
  }

}


//priority will be decided like -1,0,1,2
//if two functions have same priority then alphabetical order
