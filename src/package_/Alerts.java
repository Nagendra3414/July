package package_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Alerts.html");

		driver.findElement(By.xpath("//*[@onclick ='alertbox()']")).click();

		String alertText = driver.switchTo().alert().getText();

		System.out.println(alertText);

		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[@class ='analystic'])[2]")).click();

		driver.findElement(By.xpath("//*[@onclick ='confirmbox()']")).click();

		String alertText2 = driver.switchTo().alert().getText();

		System.out.println(alertText2);

		driver.switchTo().alert().accept();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@onclick ='confirmbox()']")).click();

		driver.switchTo().alert().dismiss();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//*[@class ='analystic'])[3]")).click();

		driver.findElement(By.xpath("//*[@onclick ='promptbox()']")).click();
		
		
		String alertText3 = driver.switchTo().alert().getText();

		System.out.println(alertText3);
		
		driver.switchTo().alert().sendKeys(alertText2);
		Thread.sleep(2000);
		driver.close();

	}

}
