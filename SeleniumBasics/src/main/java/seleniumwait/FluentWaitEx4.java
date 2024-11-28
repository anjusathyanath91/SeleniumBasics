package seleniumwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Syntax of IMPLICIT WAIT.
				//1)It should give in start that is before declaring web elements.
				//and its global wait and applicable to entire web elements
				//It will waits the driver
				//Syntax:-driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//if we repeat again then it will replace with latest timeouts.
		
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofMillis(300)).ignoring(ElementNotInteractableException.class);
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Start']"));
		
		button.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
		WebElement text = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		String s= text.getText();
		System.out.println(s);
	}

}
