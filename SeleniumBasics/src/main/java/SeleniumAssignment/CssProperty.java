package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/window-popup.php");
		WebElement fb_like_btn=driver.findElement(By.xpath("//a[text()='  Like us On Facebook ']"));
		
		String bgcolour=fb_like_btn.getCssValue("background-color");
		System.out.println(bgcolour);
		
		String fontsize=fb_like_btn.getCssValue("font-size");
		System.out.println(fontsize);
		
		String fontstyle=fb_like_btn.getCssValue("font-style");
		System.out.println(fontstyle);
	}

}
