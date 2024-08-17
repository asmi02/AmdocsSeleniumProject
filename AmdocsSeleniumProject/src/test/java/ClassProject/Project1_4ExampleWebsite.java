package ClassProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1_4ExampleWebsite
{
    public static void main(String args[])
    {
//        System.out.println("test");
        System.setProperty("webdriver.chrome.driver","D:\\downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try
        {
            driver.manage().window().maximize();
            driver.get("https://example.com/");
//            main pg link - more info
            WebElement link = driver.findElement(By.linkText("More information..."));
            link.click();
            Thread.sleep(1000);
//            tabs link - domains
            WebElement link2 = driver.findElement(By.linkText("Domains"));
            link2.click();
            Thread.sleep(1000);
//            under domain - overview link
//            WebElement link3 = driver.findElement(By.linkText("Root Zone Management"));
            WebElement li_tag = driver.findElement(By.id("nav_dom_root"));
            WebElement link3 = li_tag.findElement(By.tagName("a"));
            link3.click();
//            now again tabs link - protocols
            Thread.sleep(1000);
            WebElement link4 = driver.findElement(By.linkText("Protocols"));
            link4.click();
//            under protocols - overview link
            Thread.sleep(1000);
            WebElement link5 = driver.findElement(By.linkText("Time Zone Database"));
            link5.click();
//            now again tabs link - numbers
            Thread.sleep(1000);
            WebElement link6 = driver.findElement(By.linkText("Numbers"));
            link6.click();
//            under numbers - overview link
            Thread.sleep(1000);
            WebElement link7 = driver.findElement(By.xpath("//a[text()='RIR Allocation Data']"));
            link7.click();

//            now again tabs link - About
            Thread.sleep(1000);
            WebElement link8 = driver.findElement(By.linkText("About"));
            link8.click();
//            under numbers - overview link
            Thread.sleep(1000);
            WebElement link9 = driver.findElement(By.cssSelector("a[href='/performance']"));
            link9.click();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            driver.quit();
        }
    }
}
