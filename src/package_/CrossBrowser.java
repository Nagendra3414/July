package package_;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a Browser Name:");
		
		Scanner scr = new Scanner(System.in);
		
		String browserName = scr.nextLine();
		
		System.out.println(browserName);
		
		WebDriver driver = null;
		
		if (browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[text() ='    click   ']")).click();
		
		
		
		//driver.close();
		
		driver.quit();
		
	}

}
