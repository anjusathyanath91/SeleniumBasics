package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class XpathContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/bootstrap-alert.php");
		driver.manage().window().maximize();
		//tagName[contains(@attribute,'value')]
		WebElement greenbtn=driver.findElement(By.xpath("//button[contains(@id,'btn-success')][1]"));
		greenbtn.click();
		
		WebElement orangebtn=driver.findElement(By.xpath("//button[contains(@id,'btn-warning')][1]"));
		orangebtn.click();
		
		WebElement redbtn=driver.findElement(By.xpath("//button[contains(@id,'btn-danger')][1]"));
		redbtn.click();
		
		WebElement bluebtn=driver.findElement(By.xpath("//button[contains(@id,'btn-info')][1]"));
		bluebtn.click();
		
	}

}
