package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagetxt=driver.findElement(By.id("single-input-field"));
		messagetxt.sendKeys("hello");
		WebElement showmsgbtn=driver.findElement(By.id("button-one"));
		showmsgbtn.click();

	}

}