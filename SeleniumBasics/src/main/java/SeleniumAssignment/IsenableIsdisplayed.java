package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsenableIsdisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		WebElement show_btn = driver.findElement(By.xpath("//button[@id='button-one']"));
		
		
		boolean enable_status1=show_btn.isEnabled();
		System.out.println(enable_status1);
		
		boolean display_status1=show_btn.isDisplayed();
		System.out.println(display_status1);

	}

}
