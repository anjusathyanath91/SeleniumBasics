package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		WebElement msgtxt = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		
		//to get attribute value ,we can use any attribute present in that element
		String msg=msgtxt.getAttribute("id"); 
		System.out.println(msg);
		
		//if the attribute is not present then will get null
		String msg1=msgtxt.getAttribute("href"); 
		System.out.println(msg1);
		
		//to get visible text from a web element
		WebElement showmsg_btn = driver.findElement(By.xpath("//button[@id='button-one']"));
		String showmsg=showmsg_btn.getText();
		System.out.println(showmsg);
		
		//to get tagname of the web element
		String showmsg_tagname=showmsg_btn.getTagName();
		System.out.println(showmsg_tagname);
		
		
		//to get location of web elemnt x and y coordinates
		
	    int x=showmsg_btn.getLocation().getX();
		System.out.println(x);
		int y=showmsg_btn.getLocation().getY();
		System.out.println(y);
		
//    https://demo.guru99.com/test/social-icon.html
	}

}
