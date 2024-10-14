package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement emailid=driver.findElement(By.id("email"));//declare the webelement by id.
		emailid.click();
		emailid.sendKeys("anjusathyanath");
		WebElement pwd=driver.findElement(By.name("pass"));
		pwd.click();
		pwd.sendKeys("12333666");
		pwd.clear();
		WebElement loginbtn=driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"));
		
		

	}

}
