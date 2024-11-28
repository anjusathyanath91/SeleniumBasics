package SeleniumAssignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexFromTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
List<WebElement> allnames = driver.findElements(By.xpath("//table//tbody//tr//td[1]"));
		List<String> allnamesstringlist=new ArrayList<String>();
		
		for(WebElement elements:allnames) {
			
			allnamesstringlist.add(elements.getText());
		}
System.out.println(allnamesstringlist);
System.out.println("Index of Brielle Williamson:"+allnamesstringlist.indexOf("Brielle Williamson"));
}
	

}
 