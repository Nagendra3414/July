package package_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Class04_Select_MultiSELECT {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");

		driver.manage().window().maximize();

		WebElement dropdown1 = driver.findElement(By.xpath("//*[@name='cars']"));

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

		s.selectByIndex(0);

		Thread.sleep(3000);

		s.selectByValue("opel");
		Thread.sleep(3000);
		s.selectByVisibleText("Audi");
		Thread.sleep(3000);
		
		
	List<WebElement> selectedOptions = 	s.getAllSelectedOptions();
		

	for (int i = 0; i < selectedOptions.size(); i++) {
		System.out.println("Selected Options:" +selectedOptions.get(i).getText());
	}
	
//		s.deselectByIndex(0);
//		Thread.sleep(3000);
//		
//		s.deselectByValue("audi");
//		Thread.sleep(3000);
//		s.deselectByVisibleText("Opel");
		
	s.deselectAll();
	
		Thread.sleep(3000);
		driver.close();
	

	}

}
