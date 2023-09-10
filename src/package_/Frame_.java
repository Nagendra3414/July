package package_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://ui.vision/demo/webtest/frames/");
		
	//Frames - index number starts from 0
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@name ='mytext1']")).sendKeys("Text1");
		
	driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		
		driver.findElement(By.xpath("//*[@name ='mytext3']")).sendKeys("Text3");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//*[@class='Hvn9fb zHQkBf']")).sendKeys("Automation_Inside frame");
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//*[@name ='mytext3']")).clear();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_intro");
		
	//	driver.switchTo().frame("iframeResult");
		
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id ='iframeResult']"));
		driver.switchTo().frame(frame);
		
	String text =	driver.findElement(By.xpath("(//*[text() ='My First Heading'])")).getText();
	
	System.out.println(text);

	}

}
