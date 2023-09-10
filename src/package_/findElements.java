package package_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();
		
	List<WebElement> elements=	driver.findElements(By.xpath("//*[@class='col-md-3 col-xs-3 col-sm-3 control-label']"));
	
	System.out.println(elements.size());
	
	for(int i=1; i<elements.size(); i++)
	{
		String text =elements.get(i).getText();
		System.out.println(text);
	}
	
	
	driver.close();

	}

}
