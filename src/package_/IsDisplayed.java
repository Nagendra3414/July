package package_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayed {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("(//*[@class ='input_error form_input'])[1]")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("(//*[@class ='input_error form_input'])[2]")).sendKeys("secret_sauce45");
		
		WebElement login = driver.findElement(By.xpath("(//*[@class ='submit-button btn_action'])"));
		
	if(login.isDisplayed())
	{
		System.out.println("We are on log in page");
	}
	else
	{
		System.out.println("We are noton log in page");
	}
	
	login.click();
	
	Thread.sleep(3000);
	
	
	try
	{
	WebElement swagLabs = driver.findElement(By.xpath("(//*[text() ='Products'])"));
	
	if(swagLabs.isDisplayed())
	{
		System.out.println("We are on Home page");
	}
	else
	{
		System.out.println("We are not on Home page");
	}
	
	}
	catch(Exception e)
	{
		System.out.println(e);
	}

		
		driver.close();
	}

}
