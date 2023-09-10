package package_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();
		
		

		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		String pageTitle = driver.getTitle();
		
		System.out.println(pageTitle);
		
		
		String pageUrl = driver.getCurrentUrl();
		System.out.println(pageUrl);
		
		
		if(pageUrl.contains("https"))
		{
			System.out.println("The website is secured");
		}
		else
		{
			System.out.println("The website is not secured");
		}
		
		
		
		String pageSource =driver.getPageSource();
		
		System.out.println(pageSource);
		
		
		WebElement firstname = driver.findElement(By.xpath("//*[@ng-model ='FirstName']"));
		
		firstname.sendKeys("Automation");
		
		Thread.sleep(2000);
		firstname.clear();
		
		Thread.sleep(2000);
		
		String placeholder =firstname.getAttribute("placeholder");
		String class123 =firstname.getAttribute("class");
		
		System.out.println(placeholder);
		System.out.println(class123);

		
		
		driver.close();
		
		
		
		
	}
	
	

}
