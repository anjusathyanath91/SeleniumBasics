package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String state="Nevada";
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/jquery-select.php");
		
		WebElement dropdown = driver.findElement(By.xpath("//span[text()='Alaska']"));
    	dropdown.click();
    	WebElement blankfield = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
    	blankfield.sendKeys(state);
    	WebElement value = driver.findElement(By.xpath("//li[contains(text(),'"+state+"')]"));//parametrizing the xpath or concatenation of xapth
    	value.click();
    	
    	//following means navigate from top to bottom element
    			//preceding means bottom to top navigation 
    			//following-sibiling for going to get down sibiling
    			//preceding-sibling to go to sibiling upwards
    	}
}


