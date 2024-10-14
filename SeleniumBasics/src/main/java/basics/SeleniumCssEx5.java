package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCssEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//WebElement searchtext=driver.findElement(By.cssSelector("#twotabsearchtextbox"));//for id use # 
		WebElement searchtext=driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute"));// for class use . and remove space  from the class name and insert.inbetween
		searchtext.sendKeys("phone");
		
	}

}
