package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataExcel1 {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		
		File file = new File("C:\\Users\\Anjali.Dhawan\\eclipse-workspace\\TestNgDemo\\TestData_1.xls");
		FileInputStream fis = new FileInputStream(file);
		
		//Horrible Spreadsheet format for .xls format. For .xlsx format file we will use xssf
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		
		//getsheetAt will get the Sheet1. If u want to pull sheet by SheetName then getSheet(Sheetname)
		HSSFSheet sh = wb.getSheetAt(0);
		
		int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
		int cellCount = sh.getRow(1).getLastCellNum();
		
		//String arr[][]= new String[rowCount+1][cellCount];
		String fName = null;
		String lName = null;
		String email = null;
		String mobNum = null;
		String address = null;
		
		for(int i=1; i<=rowCount; i++)
		{
			fName = sh.getRow(i).getCell(0).getStringCellValue();
			lName = sh.getRow(i).getCell(1).getStringCellValue();
			email = sh.getRow(i).getCell(2).getStringCellValue();
			mobNum = sh.getRow(i).getCell(3).getStringCellValue();
			System.out.println(mobNum);
			address = sh.getRow(i).getCell(4).getStringCellValue();
			
		}
		
	
		//System.out.println(fName);
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)"); //x-axis and y-axis values for the location
		driver.findElement(By.id("userNumber")).sendKeys(mobNum);
		driver.findElement(By.id("userEmail")).sendKeys(email);
		driver.findElement(By.id("currentAddress")).sendKeys(address);
		
		
		driver.quit();
					
					
	}
	}

