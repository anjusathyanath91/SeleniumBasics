package seleniumwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		//implicit wait is a global wait ,scope is global and appliacble to all web element and want to declare b4webelement declaration ,it will wait the driver
		//it is applicable to all web elemnt and need to declare only once
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement button = driver.findElement(By.xpath("//button[text()='Start']"));
		button.click();
		
		WebElement text = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		String s= text.getText();
		System.out.println(s);
		
		System.out.println(driver.getPageSource()); //for getting the page source

	}

}
