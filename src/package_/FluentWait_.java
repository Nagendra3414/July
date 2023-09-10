package package_;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWait_ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver);
		
		Duration d1 = Duration.of(2, ChronoUnit.SECONDS);
	f.pollingEvery(d1);
	
	Duration d2 = Duration.of(10, ChronoUnit.SECONDS);
	f.withTimeout(d2);
	

		driver.get("https://www.easemytrip.com/flights.html");

		driver.findElement(By.xpath("//*[@class='srchBtnSe']")).click();

		f.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Book Now'])[1]")));

		driver.findElement(By.xpath("(//*[text()='Book Now'])[1]")).click();
		
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_timing1");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//*[@onclick='setTimeout(myFunction, 3000);']")).click();
		
		Thread.sleep(3000);
		
		f.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		
		
	}

}
