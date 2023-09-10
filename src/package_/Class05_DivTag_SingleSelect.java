package package_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class05_DivTag_SingleSelect {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		

		WebDriver driver = new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");

		driver.manage().window().maximize();

		
		WebElement dropdown = driver.findElement(By.xpath("(//*[contains(@class,'ui selection dropdown')])[1]"));
		
		List<WebElement> options = driver.findElements(By.xpath("(//*[contains(@class,'ui selection dropdown')])[1]/div[2]/div"));
		
		System.out.println(options.size());
		
		
		
		for (int i = 0; i < options.size(); i++) {
			dropdown.click();

			Thread.sleep(2000);
			options.get(i).click();
			
			
		}
		Thread.sleep(2000);
		
		driver.close();
	}

}
