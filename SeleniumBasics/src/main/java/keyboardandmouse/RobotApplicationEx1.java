package keyboardandmouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotApplicationEx1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//in robot there is no interaction with web element .As it comes from java not from selenium
		
		Robot robot=new Robot();//import and throws any exception
		robot.keyPress(KeyEvent.VK_DOWN);//to press the down arrow key
		
		

	}

}
