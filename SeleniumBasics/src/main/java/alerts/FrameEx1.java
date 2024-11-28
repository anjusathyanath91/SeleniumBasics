package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		//here the elemnt is inside iframe so can't find 
		//to got to i frame we need to switch//iframe inside a nested html(html-->html-->iframe)
		//Since the element is inside iframe then it cant locate the element
				//To go to iframe we need to switch the frame
				//There are 3 ways to switch to iframe
				//1)Index		
				//2)Using name or id attribute value
				//3)Based on WebElement declaration then switch
		
		//will get error for the line WebElement img = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));so we need to use iframe bcos its inside iframe
		/*driver.switchTo().frame(1);//eg:using index..in site we have three iframe and this image is inside second iframe so the index will be 1,which means starts from 0th index
		WebElement img = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		boolean s=img.isDisplayed();
		System.out.println(s);*/
		
		
		//eg:using attribute..
		
	/*	driver.switchTo().frame("a077aa5e");
		WebElement img = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		boolean s=img.isDisplayed();
		System.out.println(s);*/
		
		
		
		
		WebElement iframeee = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));//eg using iframe webelemnt ,this is the webelemtnt of iframe which contains the required image
		driver.switchTo().frame(iframeee);
		WebElement img = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		System.out.println(img.isDisplayed());
		driver.switchTo().defaultContent();//to go back from the frame 

	}

}
