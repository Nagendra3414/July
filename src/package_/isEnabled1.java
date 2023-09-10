package package_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://accounts.shopify.com/lookup");
		
		WebElement button = driver.findElement(By.xpath("(//*[text() ='Continue with email'])"));
		
		if(button.isDisplayed())
		{
			System.out.println("Button is displayed");
		}
		else
		{
			System.out.println("Button is not displayed");
		}
		
		
		if(button.isEnabled())
		{
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("Button is disabled");
		}
		
		Thread.sleep(5000);
		

		if(button.isEnabled())
		{
			System.out.println("Button is enabled");
		}
		else
		{
			System.out.println("Button is disabled");
		}
		
		driver.close();
	}

}
