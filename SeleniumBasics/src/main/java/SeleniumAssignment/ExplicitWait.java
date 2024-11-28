package SeleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://selenium.qabible.in/dynamic-load.php");
		WebElement button = driver.findElement(By.xpath("//button[@id='save']"));

		button.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[@class='card-title']")));
		WebElement nameofperson = driver.findElement(By.xpath("//h5[@class='card-title']"));

		System.out.println(nameofperson.getText());

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card text-center']")));
		WebElement imgofperson = driver.findElement(By.xpath("//div[@class='card text-center']"));

		System.out.println(imgofperson.isDisplayed());

	}

}
