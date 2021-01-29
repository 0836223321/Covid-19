package Pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CovidLocators {


    @FindBy(xpath = "/html/body/app-root/block-ui/app-mobile-landing/div[3]/div/button[1]")
    public WebElement albertonButton;

    @FindBy(xpath = "//button[contains(.,'Cashiers  2')]")
    public WebElement cashiers;

    @FindBy(xpath = "//button[contains(.,'Continue booking')]")
    public WebElement continueBookingButton;

    @FindBy(id = " form-field-2")
    public WebElement name;

    @FindBy(name = "lastName")
    public WebElement lastName;

    @FindBy(name = "contactNumber")
    public WebElement contactNumber;

    @FindBy(xpath = "//input[contains(@name,'email')]")
    public WebElement emailAddress;

    @FindBy(xpath = "(//input[@type='text'])[5]")
    public WebElement idNumber;

    @FindBy(xpath = "(//button[contains(.,'No')])[1]")
    public WebElement firstNoButton;

    @FindBy(xpath = "(//button[contains(.,'No')])[3]")
    public WebElement secondNoButton;

    @FindBy(xpath = "(//button[contains(.,'No')])[4]")
    public WebElement thirdNoButton;

    @FindBy(xpath = "(//button[contains(.,'No')])[5]")
    public WebElement fourthNoButton;

    @FindBy(xpath = "(//button[contains(.,'No')])[6]")
    public WebElement fifthNoButton;

    @FindBy(xpath = "(//button[contains(.,'No')])[7]")
    public WebElement sixthNoButton;

    @FindBy(xpath = "(//button[contains(.,'No')])[8]")
    public WebElement seventhNoButton;

    @FindBy(xpath = "(//button[contains(.,'No')])[9]")
    public WebElement eighthNoButton;

    @FindBy(xpath = "(//button[contains(.,'No')])[10]")
    public WebElement ninthNoButton;

    @FindBy(xpath = "//button[contains(.,'Submit')]")
    public WebElement submitButton;

    @FindBy(xpath = "//input[@id='age']")
    public WebElement age;

    @FindBy(xpath = "//button[contains(.,'Female')]")
    public WebElement femaleButton;

    @FindBy(xpath = "(//td[contains(@data-date,'2021-01-29')])[1]")
    public WebElement selectDateButton;

    @FindBy(xpath = "//input[@id='createDate']")
    public WebElement inputTime;

    @FindBy(xpath = "//a[@class='ui-corner-all ui-state-hover'][contains(.,'12:30')]")
    public WebElement selectTime;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement confirmButton;

    @FindBy(xpath = "//a[contains(.,'Add to calender')]")
    public WebElement addToCalendarButton;

    @FindBy(xpath = "//input[contains(@name,'temperature')]")
    public WebElement temperature;

    @FindBy(xpath = "//button[contains(.,'Confirm Temperature')]")
    public WebElement confirmTemperature;

    @FindBy(xpath = "//button[contains(.,'OK')]")
    public WebElement okButton;

    //confirm
    //@FindBy(xpath = "//div[@class='toast-title'][contains(.,'Saved')]")


}
