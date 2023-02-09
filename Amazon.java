package task;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon {
 static WebDriver driver;
@BeforeMethod

public void start(){
	
File file =new File("C:\\\\Users\\\\Machuka\\\\eclipse-workspace\\\\SDETBatch007\\src\\jar\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver =new ChromeDriver();
		driver.manage().window().maximize();;
 }
@Test
	public void test() {
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Wrist Watches");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Analogue']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Leather']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	driver.findElement(By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Titan']")).click();//span[@class='a-size-base a-color-base'][normalize-space()='Titan']
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	driver.findElement(By.xpath("//span[contains(text(),'25% Off or more')]")).click();
	driver.findElement(By.xpath("//span[normalize-space()=\"Analog Dial Men's Watch\"]")).click();;
	 }
@AfterTest
	public void end() {
	//driver.close();
}
}