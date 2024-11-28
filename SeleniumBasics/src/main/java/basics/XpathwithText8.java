package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathwithText8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//tagName[text()='Visible text']
		 
		/*WebElement forgotpwd=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));  //xpath using visible text
		forgotpwd.click();*/
		
		//tagName[contains(@attribute,'value')]
		/*WebElement forgotpwd=driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recover')]"));
		forgotpwd.click();*/
		
		//tagName[starts-with(@attribute,'value')] this is for starting portion of attribute value
		/*WebElement forgotpwd=driver.findElement(By.xpath("//a[starts-with(@href,'https://www.facebook.com/recover')]"));  
		forgotpwd.click();*/
		
		//tagName[starts-with(text(),'text')] -this is for starting portion of tag visible text 
		
		/*WebElement forgotpwd=driver.findElement(By.xpath("//a[starts-with(text(),'Forgotten')]"));  //xpath using visible text starting portion
		forgotpwd.click();*/
		
		
		// for amazon 
		
	/*	driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	 //tagname[contains(text(),'visible text')]
	
		WebElement updatelocation=driver.findElement(By.xpath("//span[contains(text(),'Update l')]"));  //xpath using contains if the text has extra space 
		updatelocation.click();
		
		
		*/
		
		// for site https://selenium.qabible.in/simple-form-demo.php
		
	//indexingusing single and double slash	//ul[@class='navbar-nav']//li[3]//a
		//ul[@class='navbar-nav']/a
	}

}
