package alerts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		WebElement open_new_tab_btn = driver.findElement(By.xpath("//button[@id='new-tab-button']"));

		
		//to print id of parent window tab
		
		String parenttab=driver.getWindowHandle();//handle to print one tab
		System.out.println(parenttab);//to print only parent tab 
		open_new_tab_btn.click();
		//open_new_tab_btn.click();
		Set<String>childwindowids=driver.getWindowHandles();
		
		System.out.println(childwindowids.size());
		System.out.println(childwindowids);//to print parent and previously opened child tabs
		
		//we need to switch to next window
		//there is  no order in set
		//itrateor we need to use here
		//using foreach
		for(String idofchild:childwindowids) {
			if(!parenttab.equals(idofchild)) {
				driver.switchTo().window(idofchild);
				break;
				
				
				
				
				
			}	
			
		}
		WebElement childwndwtitle = driver.findElement(By.xpath("//h1[@class='display-3']")); 
		System.out.println(childwndwtitle.getText());
		
		driver.close();//it will close last opened child window only
		
		driver.switchTo().window(parenttab);//switch back toparent window again

	}

}
