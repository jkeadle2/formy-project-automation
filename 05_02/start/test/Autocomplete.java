import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Autocomplete {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "c:/selenium/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("2665 High Point Ct, Loganville, GA");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        WebElement autocompleteResult = driver.findElement(By.className("form-control pac-target-input"));
        autocompleteResult.click();

        driver.quit();
    }
}
