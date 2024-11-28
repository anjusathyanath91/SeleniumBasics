package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");

		
		List<WebElement> check_box = driver.findElements(By.xpath("(//div[@class='form-group']) [2]//input"));
		for(int i=0;i<check_box.size();i++) {
			
			check_box.get(i).click();
			boolean s=check_box.get(i).isSelected();
			System.out.println(s);
		}
	}

}
