package ddf;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ddf_ArrayList {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		ExtentReports er = new ExtentReports("Deepti.html", false);
		ExtentTest et = er.startTest("Login Page");
		
		ArrayList<String> uid = new ArrayList<String>();
		ArrayList<String> uidCriteria = new ArrayList<String>();
		ArrayList<String> pwd = new ArrayList<String>();
		ArrayList<String> pwdCriteria = new ArrayList<String>();
		
		
		uid.add("testingtraining3414@gmail.com");
		uidCriteria.add("valid");
		pwd.add("qwqwehfj");
		pwdCriteria.add("invalid");
		
		uid.add("213123  3 4 3  43 4 5 3 5 34");
		uidCriteria.add("Invalid");
		pwd.add("Nagu@3414");
		pwdCriteria.add("valid");
		
		uid.add("");
		uidCriteria.add("Invalid");
		pwd.add("Nagu@3414");
		pwdCriteria.add("valid");
		
		for(int i=0; i<uid.size(); i++)
		{
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://accounts.shopify.com/lookup");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@id ='account_email']")).sendKeys(uid.get(i));
			
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//*[@name ='commit']")).click();
			
			Thread.sleep(4000);
			
			try
			{
				if(uid.get(i).length() ==0 && driver.findElement(By.xpath("//*[text() ='Enter a valid email address']")).isDisplayed())
				{
					et.log(LogStatus.PASS, "Blank username testcase passed");
				}
				else if(uidCriteria.get(i).equalsIgnoreCase("invalid") && driver.findElement(By.xpath("//*[text() ='Enter a valid email address']")).isDisplayed())
				{
					et.log(LogStatus.PASS, "Invalid username testcase passed");
				}
				else if(uidCriteria.get(i).equalsIgnoreCase("valid") && driver.findElement(By.xpath("//*[@id ='account_password']")).isDisplayed())
				{
					et.log(LogStatus.PASS, "Valid username testcase passed");
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
		
er.endTest(et);
er.flush();
		
		
	}

}
