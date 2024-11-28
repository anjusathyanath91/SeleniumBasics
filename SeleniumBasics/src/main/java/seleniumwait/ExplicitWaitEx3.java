package seleniumwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//explicit wait is applicable for only one web element .so need to declare separately for each web element.
				//explicit wait is a class and has maximum time and if exceeds the max time it will throw an exception
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Start']"));
		wait.until(ExpectedConditions.elementToBeClickable(button));//wait until the button is clickable
		button.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Tim Martin']")));
		WebElement text = driver.findElement(By.xpath("//h5[text()='Tim Martin']"));
		String s= text.getText();
		System.out.println(s);
		
		
		


	}

}
