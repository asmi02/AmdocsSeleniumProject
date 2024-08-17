package ClassProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.util.List;

public class Project2_2Wikipedia {
    public static void main(String[] args) {
        System.out.print("Test");
        System.setProperty("webdriver.chrome.driver", "D:\\downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            // Open the Wikipedia Main Page
            driver.get("https://www.wikipedia.org/");

            // Extract all links
            List<WebElement> links = driver.findElements(By.cssSelector(".central-featured-lang a"));
            System.out.println("Links:");

//             Iterate over each link and click it
            for (int i = 0; i < links.size(); i++) {
                try {
                    links = driver.findElements(By.cssSelector(".central-featured-lang a"));
                    WebElement link = links.get(i);
                    String url = link.getAttribute("href");
                    if (!url.isEmpty()) {
                        // Click the link
                        link.click();
                        Thread.sleep(2000);
                        driver.navigate().back();
                        links = driver.findElements(By.cssSelector(".central-featured-lang a"));
                        i = Math.min(i, links.size() - 1);
                    }
                } catch (Exception ex) {
                    System.out.println("found error");
                    ex.printStackTrace();
                    driver.quit();
                }
            }
            WebElement search=driver.findElement(By.id("searchInput"));
            if(search!=null){
                search.sendKeys("England");
                search.sendKeys(Keys.RETURN);
                Thread.sleep(2000);
                driver.navigate().back();
                search=driver.findElement(By.id("searchInput"));

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
