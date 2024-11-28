package alerts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//selenium has id for each window and it may change frequently
		
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
		
		//we need to switch ti next window
		//there is  no order in set
		//itrateor we need to use here
		
		Iterator<String> iterator=childwindowids.iterator();
		while(iterator.hasNext()) {//it will check is value in present in each index
			
			String idofchild=iterator.next();//it will pick first id from set
			if(!parenttab.equals(idofchild)) {
				driver.switchTo().window(idofchild);
				break;
				
				
				
				
				
			}
			
		}
		
		WebElement childwndwtitle = driver.findElement(By.xpath("//h1[@class='display-3']"));//when we comment the 44th line of code this element won't get because child to switch statement is commented there 
		System.out.println(childwndwtitle.getText());
		
		driver.close();//it will close last opened child window only
		
		driver.switchTo().window(parenttab);//switch back toparent window again
	}

}
