package seleniumwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitNewEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
	//	driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.get("https://selenium.qabible.in/jquery-progress-bar.php");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement startbtn = driver.findElement(By.xpath("//button[text()='Start Download']"));
        //i am waiting for start button to click then wait should give before that
        startbtn.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[text()='Cancel Download']")));
        WebElement complete = driver.findElement(By.xpath("//div[text()='Complete!']"));
        String output = complete.getText();
        System.out.println("Visible text of complete status is " + output);
		
	}

}
