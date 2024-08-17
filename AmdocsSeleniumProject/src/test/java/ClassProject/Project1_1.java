package ClassProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1_1
{
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
}
