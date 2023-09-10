package package_;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.automationtesting.in/Register.html");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		File destination = new File("C:\\Users\\Nagendra\\OneDrive\\Desktop\\Nag.png");
		
		FileHandler.copy(source, destination);
	
		
	}

}
