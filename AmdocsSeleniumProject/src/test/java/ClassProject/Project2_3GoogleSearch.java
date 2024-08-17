package ClassProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project2_3GoogleSearch
{
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try
        {
            // Open the Google Main Page
            driver.get("https://www.google.com/");

//            Keyboard Event RETURN
//            getting textbox
            WebElement textbox = driver.findElement(By.name("q"));// send keys is mouse event through name attribute
//            sending the search query
            textbox.sendKeys("Amdocs");
//            performing keyboard event return
            textbox.sendKeys(Keys.RETURN);
            Thread.sleep(1000);

//            Keyboard event Page Down
            WebElement pg_down = driver.findElement(By.tagName("body"));
            pg_down.sendKeys(Keys.PAGE_DOWN);
            Thread.sleep(1000);
            WebElement pg_down2 = driver.findElement(By.tagName("body"));
            pg_down2.sendKeys(Keys.PAGE_DOWN);
            Thread.sleep(1000);
            WebElement pg_down3 = driver.findElement(By.tagName("body"));
            pg_down3.sendKeys(Keys.PAGE_DOWN);
            Thread.sleep(1000);

        }
        catch (Exception ex)
        {
            System.out.println("found error");
            ex.printStackTrace();
            driver.quit();
        }
    }
}
