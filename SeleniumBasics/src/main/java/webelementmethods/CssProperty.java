package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/bootstrap-alert.php");
		WebElement green_btn1=driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']"));
		
		//to get property of webelement like bgcolour,size
		//colour of button background
	String bgcolour=green_btn1.getCssValue("background-color");
	System.out.println(bgcolour);
	
	//color of font inside the button
	String colour=green_btn1.getCssValue("color");
	System.out.println(colour);
	
	
	String fontsize=green_btn1.getCssValue("font-size");
	System.out.println(fontsize);
	
	String fontstyle=green_btn1.getCssValue("font-style");
	System.out.println(fontstyle);
	

	
	
	
	}

}
