package SeleniumAssignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://selenium.qabible.in/window-popup.php ");
		WebElement like_us_onfb_btn = driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		like_us_onfb_btn.click();
		String parenttab = driver.getWindowHandle();
		Set<String> childwindowids = driver.getWindowHandles();
		Iterator<String> iterator = childwindowids.iterator();
		while (iterator.hasNext())
		{

			String idofchild = iterator.next();
			if (!parenttab.equals(idofchild)) 
			{
				driver.switchTo().window(idofchild);
				break;

			}

		}

		WebElement childwndwtitle = driver.findElement(
				By.xpath("//div[@class='x1xka2u1 xqfms19']//span[contains(text(),'See more on Facebook')]"));
		System.out.println(childwndwtitle.getText());
		driver.close();

		driver.switchTo().window(parenttab);

	}

}
