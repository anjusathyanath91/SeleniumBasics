package seleniumwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Start']"));
		button.click();
		Thread.sleep(15000);//it is not selenium wait its java wait,selenium wait is a smart wait it will eliminate the rest of the time
		
		WebElement text = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		String s= text.getText();
		System.out.println(s);

	}

}
