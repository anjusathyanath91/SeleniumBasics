package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/enabled");
		WebElement txtbox1 = driver.findElement(By.xpath("//input[@id='disabledInput']"));
		WebElement txtbox2 = driver.findElement(By.xpath("//input[@id='input']"));

		// to check whether web element is displayed or not
		boolean status1 = txtbox1.isDisplayed();
		System.out.println(status1);
		boolean status2 = txtbox2.isDisplayed();
		System.out.println(status2);

		// to check whether web element is enabled or not
		boolean enable_status1 = txtbox1.isEnabled();
		System.out.println(enable_status1);
		boolean enable_status2 = txtbox2.isEnabled();
		System.out.println(enable_status2);

	}

}
