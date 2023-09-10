package ddf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ddf_textfile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ExtentReports er = new ExtentReports("Deepti.html", false);
		ExtentTest et = er.startTest("Login Page");
		
		//Reading thedata
		File f1 = new File("D:\\Selenium_Projects\\July_Project\\inputData.txt");
		
		FileReader fr1 = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr1);
		
		
		//Writing the data
		
		File f2 = new File("D:\\Selenium_Projects\\July_Project\\Output.txt");
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		String line ="";
		
		while((line =br.readLine()) !=null)
		{
			String[] data = line.split(",");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://accounts.shopify.com/lookup");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@id ='account_email']")).sendKeys(data[0]);
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//*[@name ='commit']")).click();
			
			Thread.sleep(4000);
			
			try
			{
				if(data[0].length() ==0 && driver.findElement(By.xpath("//*[text() ='Enter a valid email address']")).isDisplayed())
				{
					et.log(LogStatus.PASS, "Blank username testcase passed");
					bw.write("Blank username testcase passed");
					bw.newLine();
					
					
				}
				else if(data[1].equalsIgnoreCase("invalid") && driver.findElement(By.xpath("//*[text() ='Enter a valid email address']")).isDisplayed())
				{
					et.log(LogStatus.PASS, "Invalid username testcase passed");
					bw.write("Invalid username testcase passed");
					bw.newLine();
				}
				else if(data[1].equalsIgnoreCase("valid") && driver.findElement(By.xpath("//*[@id ='account_password']")).isDisplayed())
				{
					et.log(LogStatus.PASS, "Valid username testcase passed");
					et.log(LogStatus.PASS, "Valid username testcase passed");
					bw.write("Invalid username testcase passed");
					bw.newLine();
				}
				else
				{
					et.log(LogStatus.FAIL, " username testcase FAILED");
				}
			}
			catch(Exception e)
			{
				
			}
			driver.close();
			
			
		}
		
		
		br.close();
		fr1.close();
		bw.close();
		fw.close();
	}

}
