package keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement all_text_box = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		// all_text_box.sendKeys("mobile"+Keys.ENTER);//Keys is a class,this is concatenation of keyboard action
		
		all_text_box.sendKeys("mobile");
        all_text_box.sendKeys(Keys.BACK_SPACE);// or we can give enter or backspace in separate line with sendkeys,backspace will remove the last character using backspace
        
        all_text_box.sendKeys(Keys.chord(Keys.CONTROL,"a")); //keys.chord is used to press 2 buttons simultaneously for eg:CTRL+A
        all_text_box.sendKeys(Keys.DELETE);
        
        

	}

}
