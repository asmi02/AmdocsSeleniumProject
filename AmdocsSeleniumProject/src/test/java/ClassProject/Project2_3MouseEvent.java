package ClassProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project2_3MouseEvent
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


//            mouse event on search page
            Actions actions = new Actions(driver);
            WebElement searchBox = driver.findElement(By.name("q"));  // Search input box

            // Hover on the search box
            actions.moveToElement(searchBox).perform();
            Thread.sleep(2000); // Wait 2 seconds

        }
        catch (Exception ex)
        {
            System.out.println("found error");
            ex.printStackTrace();
            driver.quit();
        }





    }


}
