package package_;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class js_Scrolling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
		Thread.sleep(3000);
		WebElement fn = driver.findElement(By.xpath("//*[@placeholder ='First Name']"));
		
		js.executeScript("arguments[0].scrollIntoView()", fn);
		
		

	}

}
