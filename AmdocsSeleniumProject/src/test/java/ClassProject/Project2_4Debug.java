package ClassProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Project2_4Debug
{
    @Test
    public void demo()
    {
        // Set up the WebDriver and open the browser
        System.setProperty("webdriver.chrome.driver","D:\\downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try
        {
            driver.manage().window().maximize();
            driver.get("https://www.selenium.dev/");
            WebElement l1 = driver.findElement(By.linkText("Downloads"));
            l1.click();
            Thread.sleep(2000);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            driver.quit();
        }
    }
    @Test
    public void demo2()
    {
        // Set up the WebDriver and open the browser
        System.setProperty("webdriver.chrome.driver","D:\\downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try
        {
            driver.manage().window().maximize();
            driver.get("https://www.selenium.dev/");
            WebElement l1 = driver.findElement(By.linkText("Documentation"));
            l1.click();
            Thread.sleep(2000);
        }

        catch (Exception ex)
        {
            ex.printStackTrace();
            driver.quit();
        }
    }
    @Test
    public void demo3()
    {
        // Set up the WebDriver and open the browser
        System.setProperty("webdriver.chrome.driver","D:\\downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try
        {
            driver.manage().window().maximize();
            driver.get("https://www.selenium.dev/");
            WebElement l1 = driver.findElement(By.linkText("Documentation"));
            l1.click();

            WebElement text1 = driver.findElement(By.className("DocSearch-Button-Placeholder"));
            text1.click();
            WebElement text2 = driver.findElement(By.className("DocSearch-Input"));
            text2.sendKeys("Selenium IDE");
            text2.click();
            Actions builder = new Actions(driver);
            builder.moveToElement(text2).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER);
            Thread.sleep(2000);
        }

        catch (Exception ex)
        {
            ex.printStackTrace();
            driver.quit();
        }
    }
    @Test
    public void demo4()
    {
        // Set up the WebDriver and open the browser
        System.setProperty("webdriver.chrome.driver","D:\\downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try
        {
            driver.manage().window().maximize();
            driver.get("https://www.selenium.dev/");
            WebElement l1 = driver.findElement(By.linkText("Documentation"));
            l1.click();

            WebElement text1 = driver.findElement(By.className("DocSearch-Button-Placeholder"));
            text1.click();
            WebElement text2 = driver.findElement(By.className("DocSearch-Input"));
            text2.sendKeys("");
            text2.click();
            Actions builder = new Actions(driver);
            builder.moveToElement(text2).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER);
        }

        catch (Exception ex)
        {
            ex.printStackTrace();
            driver.quit();
        }
    }
}
