package package_;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		//js.executeScript("document.getElementsByName('q')[0].value ='Automation Testing'");
		
		js.executeScript("document.getElementsByTagName('textarea')[0].value ='Automation Testing'");
		
		//js.executeScript("document.getElementsByClassName('gNO89b')[0].click()");
		
		//js.executeScript("document.getElementById('gNO89b').click()");
		
		
		
		
		
	}

}
