package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeGetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		WebElement showmsg_btn = driver.findElement(By.xpath("//button[@id='button-one']"));
		
		//to get attribute value ,we can use any attribute present in that element
		String msg=showmsg_btn.getAttribute("id"); 
		System.out.println(msg);
		
		String showmsgtxt=showmsg_btn.getText();
		System.out.println(showmsgtxt);
	}

}
