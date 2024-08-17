package ClassProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ClassProject.Project3_2POM;

import java.time.Duration;

public class Project3_2POMTest
{
    private WebDriver driver;
    private Project3_2POM Project3_2POM;

    @BeforeClass
    public void setUp() {
        // Set up the WebDriver and open the browser
        System.setProperty("webdriver.chrome.driver","D:\\downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");

        // Initialize the FormsPage
        Project3_2POM = new Project3_2POM(driver);
        driver.manage().window().maximize();
    }

    @Test
    public void testFormSubmission() {
        // Use the FormsPage methods to interact with the page
        Project3_2POM.enterFirstName("John");
        Project3_2POM.enterLastName("Doe");
        Project3_2POM.enterEmail("john.doe@example.com");
        Project3_2POM.enterGender();
        Project3_2POM.number("9898989898");
        Project3_2POM.enterdob("November","2002","18");
        Project3_2POM.subject("Physics","Chemistry","Maths");
        Project3_2POM.checkbox();
        Project3_2POM.uploadpic("C:\\Users\\ASMI\\OneDrive\\Desktop\\Asmi Vig.png");
        Project3_2POM.addaddress("001 Model Town");
        Project3_2POM.setState("Haryana");
        Project3_2POM.setCity("Panipat");
        Project3_2POM.clickSubmit();

        // Add assertions to verify the result
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
