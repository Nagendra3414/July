package package_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class06_DivTag_MutiSelect {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");

		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.xpath("(//*[contains(@class,'ui fluid dropdown')])[1]"));

		List<WebElement> options = driver
				.findElements(By.xpath("(//*[contains(@class,'ui fluid dropdown')])[1]/div[2]/div"));
		
		
		
		System.out.println(options.size());

		dropdown.click();

		for (int i = 0; i < options.size(); i++) {

			System.out.println(options.get(i).getText());
			Thread.sleep(2000);
			options.get(i).click();

		}
		
		
		List<WebElement> deleteIcon = driver
				.findElements(By.xpath("(//*[contains(@class,'ui label transition visible')])/i"));
		
		for (int i = 0; i < deleteIcon.size(); i++) {

			Thread.sleep(2000);
			deleteIcon.get(i).click();

		}
		
		Thread.sleep(2000);

		driver.close();
	}

}
