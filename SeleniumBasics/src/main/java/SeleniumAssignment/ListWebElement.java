package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/form-submit.php");
		WebElement submitform_btn = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		submitform_btn.click();
		
		List<WebElement> errormessages = driver.findElements(By.xpath("//div[@class='invalid-feedback']"));
		
		for(int i=0;i<errormessages.size();i++) {
			String text =errormessages.get(i).getText();
			System.out.println(text);
			
		
		
	}

	}
}
