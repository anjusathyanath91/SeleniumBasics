package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	//	WebElement forgotpwd=driver.findElement(By.linkText("Forgotten password?")); //link text
		WebElement forgotpwd=driver.findElement(By.partialLinkText("Forgotten"));//partial linktext 
		forgotpwd.click();

	}

}
