package keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterEx1 {
	
	// javasript executer is a interface used to execute javascrpt commands

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;//declaration of jsexecutor ,its type casting 
		//to scroll top to down the window to 600pixels for top to bottom give value in y coordinate
		//js.executeScript("window.scrollBy(0,600)");
		
		//to scrolll from left to right the window to 600px ,from left to right give value in x coordinate
		//js.executeScript("window.scrollBy(600,0)");
		
		/*to scroll upto a particular webelemnt,here i selected the india contact button
		
		WebElement india_contact_btn = driver.findElement(By.xpath("//a[@id='icp-touch-link-country']"));
		js.executeScript("arguments[0].scrollIntoView();", india_contact_btn);*/
		

		
		//to scroll to second element 
		WebElement aboutuslink = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		WebElement careers = driver.findElement(By.xpath("//a[contains(text(),'Careers')]"));
		js.executeScript("arguments[0].scrollIntoView();", aboutuslink,careers); //it will scroll upto careers since the arguemnt[1] will move the control to careers if its arguemnt[0] it will move to upto about

		js.executeScript("arguments[0].click();",careers);
		
		
	}

}
