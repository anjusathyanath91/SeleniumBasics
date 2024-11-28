package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumXpath7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement SearchBox=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		SearchBox.sendKeys("Mobile");*/

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nike.com/in/");
		driver.manage().window().maximize();
		WebElement SearchBox=driver.findElement(By.xpath("//input[@class='search-input']"));
		SearchBox.sendKeys("sneakers");	
		
	}

}


//syntax for amazon search button 

//span[@id='nav-search-submit-text']  immediate parent
//input[@class='nav-input nav-progressive-attribute'] child

//span[@id='nav-search-submit-text']//input[@class='nav-input nav-progressive-attribute'] combined result


//using index

//    (//input[@class='nav-input nav-progressive-attribute'])[2]