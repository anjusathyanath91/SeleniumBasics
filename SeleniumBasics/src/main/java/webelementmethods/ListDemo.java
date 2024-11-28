package webelementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> menu_elements = driver.findElements(By.xpath("//ul[@class='list-group list-group-flush']//a"));
		System.out.println("size=" + menu_elements.size());
		
		for(int i=0;i<menu_elements.size();i++) { 
			 
			 String text=menu_elements.get(i).getText();//to print text of all menu names
			 System.out.println(text);
			 String attribute=menu_elements.get(i).getAttribute("href"); //to print href attribute of all elements
			 System.out.println(attribute);
			  
			  }

	}

}
