package package_;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[text() ='    click   ']")).click();
		
		
		Thread.sleep(3000);
		
		ArrayList<String> al = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(al.get(1));
		
		driver.findElement(By.xpath("(//*[text()='Downloads'])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		driver.switchTo().window(al.get(0));
		driver.findElement(By.xpath("//*[text() ='    click   ']")).click();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
