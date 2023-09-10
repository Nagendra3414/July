package package_;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		//Implicitly wait
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.easemytrip.com/flights.html");
		
		
		
		driver.findElement(By.xpath("//*[@class='srchBtnSe']")).click();
		
		
		
		driver.findElement(By.xpath("(//*[text()='Book Now'])[1]")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//*[@class ='ui-switcher']")).click();
		
		
	}

}
