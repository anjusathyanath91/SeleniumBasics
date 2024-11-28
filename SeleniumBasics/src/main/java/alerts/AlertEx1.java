package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement first_button = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		first_button.click();
		Thread.sleep(1000);
		//to get the text written on the alert box
		System.out.println(driver.switchTo().alert().getText());
		
		//to click ok on alert box
		driver.switchTo().alert().accept();
	    
		
		
		WebElement second_button = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		second_button.click();
		
		System.out.println(driver.switchTo().alert().getText());
		//to cancel alert
		driver.switchTo().alert().dismiss();
		
		//we need to send value to alert 
		WebElement third_button = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		third_button.click();
		driver.switchTo().alert().sendKeys("helloo");
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();


	}

}
