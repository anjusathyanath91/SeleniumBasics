package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();//application tab title 
         System.out.println(title);
         String currenturl=driver.getCurrentUrl(); //to get current url 
         System.out.println(currenturl);
         driver.get(currenturl);//to refresh the url..
         
         driver.quit();//to close whole site tab
         driver.close();//to close current tab
         
         
	}

}
