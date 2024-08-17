package ClassProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Project1_2Ways
{
    public static void main(String args[])
    {
        System.out.println("Test");
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try
        {
            driver.manage().window().maximize();
            driver.get("https://www.naukri.com");
            System.out.println("Title : "+driver.getTitle());
            driver.findElement(By.className("suggestor-input")).sendKeys("amdocs");  // send keys is mouse event through class name
            Actions builder = new Actions(driver);
//            using xpath
            WebElement ele = driver.findElement(By.xpath(".//*[@class='qsbSubmit']"));
            builder.moveToElement(ele).build().perform();

            builder.click(ele).build().perform();

//            using css selector
//            radio btn

            Thread.sleep(5000); // Wait 2 seconds
            driver.get("https://demoqa.com/automation-practice-form");
            WebElement ele2 = driver.findElement(By.cssSelector("label[for='gender-radio-2']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",ele2);
            ele2.click();

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            driver.quit();
        }
    }
}
