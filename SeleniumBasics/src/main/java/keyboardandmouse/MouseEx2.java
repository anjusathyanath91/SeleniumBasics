package keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//actions class used for mouse interactions
		Actions actions=new Actions(driver);
		
		WebElement sign_in = driver.findElement(By.xpath("//span[contains(text(),'Hello, sign in')]"));
		actions.moveToElement(sign_in).build().perform();//to click on sign in button 
		//actions.click().build().perform();//to click on webelement
		
		
		//Mouse action using entering data in search field
		WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		actions.sendKeys(searchbox, "Mobiles").build().perform();
		
		//to click and hold an element
		actions.clickAndHold(searchbox).build().perform();
		
		
		//to release control of an element
		actions.release(searchbox).build().perform();
		
		
		//to click on any keyboard button using mouse
		actions.keyDown(Keys.BACK_SPACE).build().perform();

	}

}
