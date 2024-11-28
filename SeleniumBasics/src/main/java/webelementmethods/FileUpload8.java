package webelementmethods;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement choosefile = driver.findElement(By.xpath("//input[@id='file-upload']"));
		String path="C:\\Users\\DELL\\Desktop\\excel1.xlsx";
		//choosefile.sendKeys(path); //either we can send the path using sendkeys or absolute path
		File file=new File(path);//its a constructor method to pass the path as arguement
		
		String s=file.getAbsolutePath(); //to print the path 
		System.out.println(s);
		
		choosefile.sendKeys(file.getAbsolutePath());//to take the absolute file path
		

	}

}
