package ClassProject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Project3_2POM
{
    private WebDriver driver;

    @FindBy(id = "firstName")
    private WebElement firstNameField;

    @FindBy(id = "lastName")
    private WebElement lastNameField;

    @FindBy(id = "userEmail")
    private WebElement emailField;

    @FindBy(css = "label[for='gender-radio-2']")
    private WebElement radio;

    @FindBy(css = ".subjects-auto-complete__input input")
    private WebElement subjectInput;

    @FindBy(id = "userNumber")
    private WebElement numberField;

    By state = By.id("react-select-3-input");
    By city = By.id("react-select-4-input");


    By dateOfBirthInput = By.id("dateOfBirthInput");
    By monthDropdown = By.className("react-datepicker__month-select");
    By yearDropdown = By.className("react-datepicker__year-select");
    By day = By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='24']");

    @FindBy(css = "label[for='hobbies-checkbox-1']")
    private WebElement checkbox1;

    @FindBy(css = "label[for='hobbies-checkbox-2']")
    private WebElement checkbox2;

    @FindBy(id = "uploadPicture")
    private WebElement pic;

    @FindBy(id = "currentAddress")
    private WebElement address;

    @FindBy(id = "submit")
    private WebElement submitButton;


    public Project3_2POM (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterGender() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",radio);
        radio.click();
    }

    public void number(String num) {
        numberField.sendKeys(num);
    }

    public void enterdob(String month, String year, String dayText)
    {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(dateOfBirthInput));
        new Select(driver.findElement(monthDropdown)).selectByVisibleText(month);
        new Select(driver.findElement(yearDropdown)).selectByVisibleText(year);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='" + dayText + "']")));
    }

    public void subject(String sub1,String sub2,String sub3) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",subjectInput);
        subjectInput.sendKeys(sub1);
        subjectInput.sendKeys(Keys.TAB);
        subjectInput.sendKeys(sub2);
        subjectInput.sendKeys(Keys.TAB);
        subjectInput.sendKeys(sub3);
        subjectInput.sendKeys(Keys.TAB);
    }

    public void checkbox() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",checkbox1);
        checkbox1.click();
        checkbox2.click();
    }

    public void uploadpic(String url)
    {
        pic.sendKeys(url);
    }

    public void addaddress(String add)
    {
        address.sendKeys(add);
    }

    public void setState(String stateName) {

        WebElement stateEle = driver.findElement(state);
        stateEle.sendKeys(stateName);
        stateEle.sendKeys(Keys.ENTER);
    }

    public void setCity(String cityName) {
        WebElement cityEle = driver.findElement(city);
        cityEle.sendKeys(cityName);
        cityEle.sendKeys(Keys.ENTER);
    }



    public void clickSubmit() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",submitButton);
        submitButton.click();
    }
}
