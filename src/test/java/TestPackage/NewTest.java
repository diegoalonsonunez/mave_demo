package TestPackage;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;



public class NewTest {
  
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	WebElement search_box = driver.findElement(By.id("searchOpen"));
	search_box.click();
	WebElement type_box = driver.findElement(By.xpath("//input[@aria-hidden='false']"));
	type_box.sendKeys("iphone 8" + Keys.ENTER);
	Thread.sleep(5000);  
  }
  
  @BeforeTest
  public void beforeTest() {
	  // Alternative way to call a driver
	  WebDriverManager.chromedriver().setup();
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.cricketwireless.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
