package task;
//Import the necessary libraries
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomation {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
    	File file = new File("C:\\Users\\Machuka\\eclipse-workspace\\SDETBatch007\\src\\jar\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Machuka\\eclipse-workspace\\SDETBatch007\\src\\jar\\chromedriver.exe");

        // Create an instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Gmail
        driver.get("https://gmail.com");

        // Find the email and password input fields and enter the login credentials
        WebElement email = driver.findElement(By.id("identifierId"));
        email.sendKeys("douglasmachuka47@gmail.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[1]]']")).click();
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("@Machuka47");
        password.submit();

        // Wait for the page to load
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click the Compose button to start a new email
        driver.findElement(By.xpath("//div[text()='Compose']")).click();

        // Find the To, Subject, and Body fields and enter the desired values
        WebElement to = driver.findElement(By.name("to"));
        to.sendKeys("douglasmachuka47@gmail.com");
        WebElement subject = driver.findElement(By.name("subjectbox"));
        subject.sendKeys("Test Mail");
        WebElement body = driver.findElement(By.xpath("//div[@role='textbox']"));
        body.sendKeys("Test Email Body");

        // Label the email as "Social"
        driver.findElement(By.xpath("//div[text()='Social']")).click();

        // Send the email
        driver.findElement(By.xpath("//div[text()='Send']")).click();

        // Wait for the email to arrive in the inbox
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click the Inbox label to go to the inbox
        driver.findElement(By.xpath("//a[@title='Inbox']")).click();

        // Mark the email as starred
        driver.findElement(By.xpath("//span[@role='checkbox']")).click();

        // Open the received email
        driver.findElement(By.xpath("//span[text()='Test Mail']")).click();

        // Verify that the email is labeled as "Social"
        WebElement label = driver.findElement(By.xpath("//span[text()='Social']"));
        if (!label.isDisplayed()) {
            System.out.println("Error: Email is not labeled as 'Social'");
        }

        // Verify the subject and body of the received email
        WebElement receivedSubject;
    }
}
