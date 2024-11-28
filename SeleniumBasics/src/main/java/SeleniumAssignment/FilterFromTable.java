package SeleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilterFromTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-filter.php");
		driver.manage().window().maximize();
		WebElement search_name = driver.findElement(By.xpath("//table//thead//tr[2]//th[1]//input"));
		search_name.sendKeys("Vivian Harrell");
List<WebElement> detailsof_Vivian = driver.findElements(By.xpath("//table//tbody//tr[1]//td"));
		
		for(int i=0;i<detailsof_Vivian.size();i++) {
			String text =detailsof_Vivian.get(i).getText();
			System.out.println(text);
	}

}
}
