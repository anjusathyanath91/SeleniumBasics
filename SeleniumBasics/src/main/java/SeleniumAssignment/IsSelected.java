package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		WebElement male_radio_btn = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		male_radio_btn.click();
		boolean radiobtn1=male_radio_btn.isSelected();
		

		System.out.println(radiobtn1);
		
		WebElement female_radio_btn = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean radiobtn2=female_radio_btn.isSelected();
		System.out.println(radiobtn2);
		
	}

}