package ClassProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1_3ChromeDriver
{
    public static void main(String args[])
    {
        System.out.print("Text");
        System.setProperty("webdriver.chrome.driver","D:\\downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

}
