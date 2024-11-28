package keyboardandmouse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		//to print columns headings
	/*WebElement table_column_offc = driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[3]"));
        System.out.println(table_column_offc.getText());
        
        WebElement table_age_column = driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th[4]"));
        System.out.println(table_age_column.getText());*/
		
        
        //to print all row headings
        
		/*List<WebElement> columnheadings = driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th"));
		
		for(int i=0;i<columnheadings.size();i++) {
			String text =columnheadings.get(i).getText();
			System.out.println(text);
        
	}
*/
		//to print Cedric Kelly	's office name
		
	/*	 WebElement table_heading = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td[3]"));
	        System.out.println(table_heading.getText());*/
	        
	      //to print all name  
	   /*     List<WebElement> allname = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
			
			for(int i=0;i<allname.size();i++) {
				String text =allname.get(i).getText();
				System.out.println(text);
	        
		}
		*/
		
		List<WebElement> alldetilsofcolleenhurst = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[9]//td"));
		
		for(int i=0;i<alldetilsofcolleenhurst.size();i++) {
			String text =alldetilsofcolleenhurst.get(i).getText();
			System.out.println(text);
}
}
}