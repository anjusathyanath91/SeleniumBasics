package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationEx {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");//navigate stores site history
		driver.navigate().to("https://www.javatpoint.com/method-in-java");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
		
		

	}

}
