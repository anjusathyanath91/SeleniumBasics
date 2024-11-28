package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListElementColour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/bootstrap-alert.php");

		
		List<WebElement> menu = driver.findElements(By.xpath("(//div[@class='col-md-6']) [1]//button"));
		
		for(int i=0;i<menu.size();i++) {
			String text =menu.get(i).getText();
			System.out.println(text);
			String colour=menu.get(i).getCssValue("background-color");
			System.out.println(colour);
			
			
		}

	}

}
