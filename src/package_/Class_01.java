package package_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Class_01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		
//		
//		WebElement hello = driver.findElement(By.xpath("//*[text()='Hello, sign in']"));
//		
//		
//		Actions a = new Actions(driver);
//		
//		a.moveToElement(hello).build().perform();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//*[text()='Sign in']")).click();
		
		//*[text()='Sign in']
		
		//driver.findElement(By.name("q")).sendKeys("Automation testing");
		
		//driver.findElement(By.id("APjFqb")).sendKeys("testing");
		
		driver.findElement(By.className("gLFyf")).sendKeys("Hi");
		
		// driver.findElement(By.tagName("textarea")).sendKeys("text");
		
		//driver.findElement(By.linkText("Images")).click();
		
		//driver.findElement(By.partialLinkText("Imag")).click();
		
		driver.findElement(By.xpath("//*[text()='Images']")).click();
		
	}

}
