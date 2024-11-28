package keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Actions actions=new Actions(driver);
		
		
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		WebElement double_click= driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		//it will right click on web application.Not on a specific webelement
		actions.contextClick().build().perform();
		
		//it will right click on web application on right click button
		actions.contextClick(right_click).build().perform(); //its an example of method overloading where context click has parameter
		
		//it will double click on  anywhere on web application where the mouse cursor is present
		actions.doubleClick().build().perform();
		
		//it will double click on the double click button ,since the parameter passed here is of double click button
		actions.doubleClick(double_click).build().perform();
		
	}

}
