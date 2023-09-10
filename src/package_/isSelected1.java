package package_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement button1 = driver.findElement(By.xpath("//*[@id ='checkbox1']"));
		
		WebElement button2 = driver.findElement(By.xpath("//*[@id ='checkbox2']"));
		
		button1.click();
		
		Thread.sleep(3900);
		
		if(button1.isSelected())
		{
			System.out.println("Button1 is selecetd");
		}
		else
		{
			System.out.println("Button1 is not selecetd");
		}
		
		if(button2.isSelected())
		{
			System.out.println("Button2 is selecetd");
		}
		else
		{
			System.out.println("Button2 is not selecetd");
		}
		
		driver.close();
	}

}
