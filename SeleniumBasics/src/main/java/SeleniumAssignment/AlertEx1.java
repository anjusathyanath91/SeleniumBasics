package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		
		WebElement clickme_greenbutton = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickme_greenbutton.click();
		
		//to get the text written on the alert box
				System.out.println(driver.switchTo().alert().getText());
				
				Thread.sleep(5000);
				//to click ok on alert box
				driver.switchTo().alert().accept();
				
				
				WebElement clickme_orangebtn = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
				clickme_orangebtn.click();
				
				System.out.println(driver.switchTo().alert().getText());
				//to cancel alert
				Thread.sleep(5000);
				driver.switchTo().alert().dismiss();
				
				
				WebElement red_prompt_btn = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
				red_prompt_btn.click();
				
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().sendKeys("prompt button");
				Thread.sleep(5000);
				driver.switchTo().alert().accept();

	}

}
