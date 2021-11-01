package xpathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class xpath {
	@Test
	public void xpathprec() {
		
				ChromeOptions options = new ChromeOptions(); // close notification alert

				options.addArguments("--disable-notifications"); // close notification alert

				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\jasdeep.singh\\eclipse-workspace\\Software\\chromedriver.exe");
				WebDriver driver = new ChromeDriver(options);

				driver.get("http://demo.guru99.com/test/selenium-xpath.html");
				
				/*
				 * Xpath 
				 */
				driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("jas@123");
				
				String abcElement= driver.findElement(By.xpath("//*[text()='UserID']")).getText();
				System.out.println("element"+abcElement);
				
				
				
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys("jasdeep");
				
				//contains
//				driver.findElement(By.xpath("//*[contains(@type,'sub')]")).click();
				
				//Or and And
				
//				driver.findElement(By.xpath("//*[@type='password' and @name='password']")).click();
				
				// XPath axes methods:
				
				driver.findElement(By.xpath("//*[@name='password']//following::input[1]")).click();
				
//				//*[@id='java_technologies']//child::li          ---select All Chiled elements
				
				//Xpath=//*[@type='submit']//preceding::input
				
				//  //*[@type='submit']//following::div
				//*[@type='submit']//following-sibling::input
				
				//label[@id='message23']//parent::td//*[@name='uid']
				
				////*[@name='frmLogin']//descendant::input[2]
				
				
				
				
	}
	

}
