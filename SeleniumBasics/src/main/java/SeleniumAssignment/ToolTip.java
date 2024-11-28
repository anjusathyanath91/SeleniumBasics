package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/window-popup.php");
		WebElement fb_like_btn=driver.findElement(By.xpath("//a[text()='  Like us On Facebook ']"));
		String tooltip_text = fb_like_btn.getAttribute("title");
		 System.out.println(tooltip_text);
		 
		 WebElement follow_all_btn=driver.findElement(By.xpath("//a[@id='windowMulti']"));
			String tooltip_text2 = follow_all_btn.getAttribute("title");
			 System.out.println(tooltip_text2);
	}

}
