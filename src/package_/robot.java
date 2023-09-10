package package_;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class robot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Robot r = new Robot();
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		Actions a = new Actions(driver);
		WebElement b = driver.findElement(By.xpath("//*[@type = 'file']"));
		a.click(b).build().perform();

		Thread.sleep(3000);
		
		StringSelection s = new StringSelection("C:\\Search.png");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		
		
		
	}

}
