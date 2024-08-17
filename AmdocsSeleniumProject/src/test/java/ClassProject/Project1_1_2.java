package ClassProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project1_1_2
{
    public static void main(String args[])
    {
        System.setProperty("webdriver.gecko.driver","D:\\downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
    }
}
