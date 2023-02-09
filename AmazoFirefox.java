package task;
// Import the necessary libraries
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazoFirefox {
    public static void main(String[] args) {
        // Create an instance of the FirefoxDriver
        WebDriver driver = new FirefoxDriver();

        // Navigate to Amazon
        driver.get("https://www.amazon.in");

        // Find the search bar and enter the search query
        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        searchBar.sendKeys("Wrist Watches");
        searchBar.submit();

        // Filter the results to show only Analogue watches
        driver.findElement(By.xpath("//div[@data-value='Analogue']")).click();

        // Filter the results to show only watches made of leather
        driver.findElement(By.xpath("//div[@data-value='leather']")).click();

        // Filter the results to show only watches from the brand "Titan"
        driver.findElement(By.xpath("//div[@data-value='Titan']")).click();

        // Filter the results to show only watches with a discount of 25% or more
        driver.findElement(By.xpath("//div[@data-value='25']")).click();

        // Get the fifth element from the search results
        WebElement fifthElement = driver.findElements(By.xpath("//div[@data-index]")).get(4);

        // Do something with the fifth element (e.g. print its text)
        System.out.println(fifthElement.getText());

        // Close the browser
        driver.close();
    }
}
