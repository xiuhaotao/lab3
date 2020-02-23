import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class Lab3  {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.autorentals.com/";
        driver.get(baseUrl);
        driver.findElement(By.id("pickup")).sendKeys("Toronto, ON");
        WebElement pickupDate= driver.findElement(By.id("pickup-date"));

        ((JavascriptExecutor)driver).executeScript ("document.getElementById('pickup-date').removeAttribute('readonly',0);");
        pickupDate.clear();
        pickupDate.sendKeys("03/20/2020");
        pickupDate.click();
        ((JavascriptExecutor)driver).executeScript ("document.getElementById('dropoff-date').removeAttribute('readonly',0);");
        WebElement droppOffDate = driver.findElement(By.id("dropoff-date"));
        droppOffDate.clear();
        droppOffDate.sendKeys("03/28/2020");
        droppOffDate.click();
        //driver.findElement(By.id("dropoff-time-selected")).sendKeys("9:00");
        driver.findElement(By.id("find-car-deals")).click();
        System.out.println("Login Done with Submit");


    }
}