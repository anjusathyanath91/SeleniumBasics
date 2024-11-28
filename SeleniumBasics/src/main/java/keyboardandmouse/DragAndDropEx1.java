package keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
driver.manage().window().maximize();
		
		Actions actions=new Actions(driver);
		
		
		WebElement source = driver.findElement(By.xpath("//a[text()=' BANK ']"));

		
		WebElement destination =driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		
		
		actions.dragAndDrop(source, destination).build().perform();
		
	}

}
