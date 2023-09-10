package ddf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDF_Excel {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub

		FileInputStream fs = new FileInputStream("D:\\Selenium_Projects\\July_Project\\InputDataFile.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int Rows = sheet.getLastRowNum();
		
		System.out.println(Rows);
		
		int columns = sheet.getRow(0).getLastCellNum();
		
		System.out.println(columns);
		
		sheet.getRow(0).createCell(columns).setCellValue("Result");
		
		for(int i=1; i<= Rows; i++)
		{
			
			
			String fname =sheet.getRow(i).getCell(0).toString();
			String lname =sheet.getRow(i).getCell(1).toString();
			String address =sheet.getRow(i).getCell(2).toString();
			String email =sheet.getRow(i).getCell(3).toString();
			String phone =sheet.getRow(i).getCell(4).toString();

			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demo.automationtesting.in/Register.html");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@ng-model='FirstName']")).sendKeys(fname);
			
			driver.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys(lname);
			
			driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys(address);
			
			driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys(email);
			
			driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys(phone);
			
			Thread.sleep(2000);
			
			sheet.getRow(i).createCell(columns).setCellValue("PASS");
			
			driver.close();
			
		}
		
		FileOutputStream fo = new FileOutputStream("D:\\Selenium_Projects\\July_Project\\InputDataFile.xlsx");
		workbook.write(fo);
		fo.close();
		fs.close();
		
		

	}

}
