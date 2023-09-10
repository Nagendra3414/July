package package_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement drag = driver.findElement(By.id("draggable"));

		WebElement drop = driver.findElement(By.id("droppable"));

		Actions a = new Actions(driver);

		a.dragAndDrop(drag, drop).build().perform();

		driver.navigate().refresh();

		driver.get("https://jqueryui.com/slider/");

		a.pause(5000).build().perform();

		

		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//*[@id ='slider']/span"));

		a.pause(3000).build().perform();

		a.dragAndDropBy(slider, 200, 0).build().perform();
		
		a.pause(3000).build().perform();

		a.dragAndDropBy(slider, -100, 0).build().perform();

	}

}
