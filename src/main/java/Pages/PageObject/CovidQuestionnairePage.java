package Pages.PageObject;

import Base.TestBase;
import Pages.Locators.CovidLocators;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class CovidQuestionnairePage extends TestBase {


    public CovidLocators covidLocators;

    public CovidQuestionnairePage() {

        this.covidLocators = new CovidLocators();
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 2);
        PageFactory.initElements(factory, this.covidLocators);
    }

    public void covidQuestions(String firstName, String surname, String contactNumber, String email, String idNumber,
                               String age, String temperature, String expected_results){

        covidLocators.albertonButton.click();
        covidLocators.cashiers.click();

        covidLocators.name.sendKeys(firstName);
        covidLocators.lastName.sendKeys(surname);
        covidLocators.contactNumber.sendKeys(contactNumber);
        covidLocators.emailAddress.sendKeys(email);
        covidLocators.idNumber.sendKeys(idNumber);
        covidLocators.age.sendKeys(age);
        covidLocators.femaleButton.click();


        covidLocators.continueBookingButton.click();
        covidLocators.firstNoButton.click();
        covidLocators.secondNoButton.click();
        covidLocators.thirdNoButton.click();
        covidLocators.fourthNoButton.click();
        covidLocators.fifthNoButton.click();
        covidLocators.sixthNoButton.click();
        covidLocators.seventhNoButton.click();
        covidLocators.eighthNoButton.click();
        covidLocators.ninthNoButton.click();
        covidLocators.submitButton.click();

        covidLocators.selectDateButton.click();
        covidLocators.inputTime.click();
        covidLocators.selectTime.click();
        covidLocators.confirmButton.click();
        covidLocators.addToCalendarButton.click();
        covidLocators.temperature.sendKeys(temperature);
        covidLocators.confirmTemperature.click();
        covidLocators.okButton.click();


    }
}
