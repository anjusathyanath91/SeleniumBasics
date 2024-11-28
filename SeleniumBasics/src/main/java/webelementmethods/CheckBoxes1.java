package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement chkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		
		// to check whether web element is selected or not	
		boolean status_chkbox1 = chkbox1.isSelected();
		System.out.println(status_chkbox1);
		WebElement chkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
		boolean status_chkbox2 = chkbox2.isSelected();
		System.out.println(status_chkbox2);
		if(status_chkbox1==false) {
			chkbox1.click();
			
		}
		if(status_chkbox2==false) {
			chkbox2.click();
			
		}
	// to check whether web element is displayed or not	
		boolean status1=chkbox1.isDisplayed();
		System.out.println(status1);
		boolean status2=chkbox2.isDisplayed();
		System.out.println(status2);
		
		// to check whether web element is enabled or not	
				boolean enable_status1=chkbox1.isEnabled();
				System.out.println(enable_status1);
				boolean enable_status2=chkbox2.isEnabled();
				System.out.println(enable_status2);
	}

}
