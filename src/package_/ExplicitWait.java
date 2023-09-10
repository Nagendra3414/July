package package_;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//Default frequency time is 500ms (1/2 sec)

		driver.get("https://www.easemytrip.com/flights.html");

		driver.findElement(By.xpath("//*[@class='srchBtnSe']")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Book Now'])[1]")));

		driver.findElement(By.xpath("(//*[text()='Book Now'])[1]")).click();
		
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_timing1");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//*[@onclick='setTimeout(myFunction, 3000);']")).click();
		
		Thread.sleep(3000);
		
		w.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();

	}

}
