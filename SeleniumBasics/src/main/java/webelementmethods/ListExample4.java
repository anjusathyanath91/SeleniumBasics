package webelementmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");

		// List<WebElement> objectRef=driver.findelements

		List<WebElement> menu_elements = driver.findElements(By.xpath("//ul[@class='navbar-nav']//a"));
		System.out.println("size=" + menu_elements.size()); // to print size of list here it ll be 8, since 8 menus are there

		// using for loop

		/*
		 * for(int i=0;i<menu_elements.size();i++) { //for iterating the menu and to
		 * print elements of menu list
		 * 
		 * String text=menu_elements.get(i).getText(); System.out.println(text);
		 * 
		 * 
		 * }
		 */

		// using for each loop or enhanced for loop
		for (WebElement element : menu_elements) {

			String print_elemts = element.getText();
			System.out.println(print_elemts);
		}
	}

}
