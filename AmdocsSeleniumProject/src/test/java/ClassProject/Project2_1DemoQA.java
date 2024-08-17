package ClassProject;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Project2_1DemoQA
{
    public static void main(String[] args) {
        System.out.print("Test");
        System.setProperty("webdriver.gecko.driver", "D:\\downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        try {
            driver.get("https://demoqa.com/automation-practice-form");

            //BASIC DETAILS
            driver.findElement(By.id("firstName")).sendKeys("Asmi");
            driver.findElement(By.id("lastName")).sendKeys("Vig");
            driver.findElement(By.id("userEmail")).sendKeys("asmi.vig@gmail.com");
            Thread.sleep(1000);


            //RADIO BUTTON
            WebElement radio = driver.findElement(By.cssSelector("label[for='gender-radio-2']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",radio);
            radio.click();

            //NUMBER
            driver.findElement(By.id("userNumber")).sendKeys("8989898989");

            // DATE
            WebElement dateElement = driver.findElement(By.id("dateOfBirthInput"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",dateElement);
            dateElement.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

            // Select year
            WebElement yearDropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("react-datepicker__year-select")));
            Select selectYear = new Select(yearDropdown);
            selectYear.selectByVisibleText("2002");

            // Select month
            WebElement monthDropdown = driver.findElement(By.className("react-datepicker__month-select"));
            Select selectMonth = new Select(monthDropdown);
            selectMonth.selectByVisibleText("November");

            // Select day
            WebElement day = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'react-datepicker__day--016') and not(contains(@class, 'react-datepicker__day--outside-month'))]")));
            day.click();

//            SUBJECTS
            WebElement subjectInput = driver.findElement(By.cssSelector(".subjects-auto-complete__input input"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", subjectInput);

            subjectInput.sendKeys("Physics");
            Thread.sleep(1000);
            subjectInput.sendKeys(Keys.TAB); // Ensure to trigger the selection


            subjectInput.sendKeys("English");
            Thread.sleep(1000);
            subjectInput.sendKeys(Keys.TAB);// Ensure to trigger the selection

            subjectInput.sendKeys("Computer Science");
            Thread.sleep(1000);
            subjectInput.sendKeys(Keys.TAB); // Ensure to trigger the selection


            //CHECKBOX
            WebElement checkbox1 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",checkbox1);
            checkbox1.click();
            WebElement checkbox2 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
            checkbox2.click();

            //IMAGE
            driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\ASMI\\OneDrive\\Desktop\\Asmi Vig.png");

            //ADDRESS
            driver.findElement(By.id("currentAddress")).sendKeys("001 Model Town");

            //STATE AND CITY
            WebElement state = driver.findElement(By.id("react-select-3-input"));
            state.sendKeys("Haryana");
            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofMillis(1000));
            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id^='react-select-3-option'")));
            WebElement suggestions1 = driver.findElement(By.xpath("//div[@id='react-select-3-option-2']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",suggestions1);

            WebElement city = driver.findElement(By.id("react-select-4-input"));
            city.sendKeys("Panipat");
            WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id^='react-select-4-option'")));
            WebElement suggestions2 = driver.findElement(By.xpath("//div[@id='react-select-4-option-1']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",suggestions2);

            //SUBMIT BUTTON
            WebElement submit = driver.findElement(By.id("submit"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",submit);
            submit.click();

        } catch (Exception ex) {
            System.out.println("found error");
            ex.printStackTrace();
            driver.quit();
        }
    }
}
