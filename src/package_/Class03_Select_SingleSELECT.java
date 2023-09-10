package package_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class03_Select_SingleSELECT {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		WebElement dropdown1 = driver.findElement(By.xpath("//*[@id ='Skills']"));

		Select s = new Select(dropdown1);

		if (s.isMultiple()) {
			System.out.println("Dropdwon is Multi select");
		} else {
			System.out.println("Dropdwon is single select");
		}

		List<WebElement> options = s.getOptions();

		System.out.println(options.size());

		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}

		s.selectByIndex(7);

		Thread.sleep(3000);

		s.selectByValue("Client Support");
		Thread.sleep(3000);
		s.selectByVisibleText("Installation");
		Thread.sleep(3000);
		driver.close();

	}

}
