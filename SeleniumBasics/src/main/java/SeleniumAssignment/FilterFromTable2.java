package SeleniumAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterFromTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://selenium.qabible.in/table-sort-search.php");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table//tbody//tr[4]//td")));
List<WebElement> detailsof_Bradley = driver.findElements(By.xpath("//table//tbody//tr[4]//td"));
		
		for(int i=0;i<detailsof_Bradley.size();i++) {
			String text =detailsof_Bradley.get(i).getText();
			System.out.println(text);
	}

}

	}


