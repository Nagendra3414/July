package package_;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Click {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.get("https://demo.automationtesting.in/Register.html");

		driver.navigate().to("https://demo.automationtesting.in/Register.html");

//		Thread.sleep(3000);
		WebElement webTable = driver.findElement(By.xpath("//*[text()='WebTable']"));
//		

		Actions a = new Actions(driver);

		a.click(webTable).build().perform();

		Thread.sleep(3000);
//		
		driver.navigate().back();

		WebElement fname = driver.findElement(By.xpath("//*[@placeholder='First Name']"));

		a.sendKeys(fname, "Automation actions class").build().perform();
		
		a.moveToElement(driver.findElement(By.xpath("//*[text()='SwitchTo']"))).build().perform();
//		
		Thread.sleep(3000);
		
		a.doubleClick(driver.findElement(By.xpath("(//*[text()='Register'])[3]")))
		.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		fname.clear();
		Thread.sleep(3000);
		
		a.click(fname).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		
		a.contextClick(driver.findElement(By.xpath("(//*[text()='Register'])[3]"))).build().perform();
		
		Thread.sleep(3000);
//		
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		
//		driver.navigate().refresh();
//		
//		Thread.sleep(3000);

		driver.close();
	}

}
