package ExtentReport_;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report123 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		ExtentReports er = new ExtentReports("Deepti.html", false);
		ExtentTest et = er.startTest("Verify the title of the page");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		String title =driver.getTitle();
		
		if(title.equals("Register123"))
		{
			et.log(LogStatus.PASS, "Title testcase is passed");
		}
		else
		{
			Report123 obj = new Report123();
			String ss =obj.screenshot(driver);
			
			et.log(LogStatus.FAIL, "Title testcase is failed", et.addScreenCapture(ss));
		}
		
		
		
		driver.close();
		
		er.endTest(et);
		er.flush();
	}
	
	public String screenshot(WebDriver driver) throws Exception
	{
		String ssName ="FailedTestcase.png";
		
		File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File f2 = new File(ssName);
		
		FileHandler.copy(f1, f2);
		
		return ssName;
	}

}
