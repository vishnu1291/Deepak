package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class VerifyTitle {
WebDriver driver;

@Test
public void verifyTitle() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
ChromeOptions options = new ChromeOptions(); 
options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
driver = new ChromeDriver(options);
driver.manage().window().maximize();
driver.get("https://www.google.com/");
	
String pageTitle = driver.getTitle();

if(pageTitle.equals("Google")) {
System.out.println("Google Application is Launch Successfully....Passed");
}
else {
	System.out.println("Google Application is not Launch Successfully....Failed");	
}
Thread.sleep(3000);

driver.get("https://www.facebook.com/");

driver.findElement(By.id("email")).sendKeys("0004vs");
driver.findElement(By.id("pass")).sendKeys("vishnu1.,");
driver.findElement(By.id("loginbutton")).click();
Thread.sleep(3000);
driver.close();
}
	
	
	
}
