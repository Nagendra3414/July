package package_;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_highlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		WebElement fn = driver.findElement(By.xpath("//*[@placeholder ='First Name']"));
		
		WebElement ln = driver.findElement(By.xpath("//*[@placeholder ='Last Name']"));

		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].value ='FIRSTNAME'", fn);
		
		js.executeScript("arguments[0].value ='LastName'", ln);
		
		
		js.executeScript("arguments[0].style.border ='green 6px solid'", fn);
		
		js.executeScript("arguments[0].style.border ='yellow 20px dashed'", ln);

		js.executeScript("window.alert('This is test alert')");
		

		
		
	}

}
