package Testcases;

import Base.TestBase;
import Listeners.ExtentReport;
import Pages.PageObject.CovidQuestionnairePage;
import Utilities.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

public class CovidTest extends TestBase {

    ExtentReport extentReport = new ExtentReport();

    @BeforeTest
    public void setUp() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\java\\Executables\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(("https://qms.ekurhuleni.gov.za/mobile-landing"));
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
    }

        @Test(dataProviderClass = DataProvider.class, dataProvider = "ReadData")
        public void covidTest(Hashtable<String, String> data) throws InterruptedException, IOException {


            extentReport.start(data.get("Test_Case_Description"));

            try{
                CovidQuestionnairePage  covidQuestionnairePage = new CovidQuestionnairePage();

               covidQuestionnairePage.covidQuestions(data.get("FirstName"), data.get("Surname"), data.get("Contact_Number"),
                       data.get("Email"), data.get("ID_Number"), data.get("Age"), data.get("Temperature"), data.get("Expected_Results"));

            }catch (Exception e){

                extentReport.failure(e.getMessage() + " " + "." +  "Expected results are: " +"  "+ data.get("Expected_Results"));
                Assert.assertFalse(isElementPresent(By.xpath("//div[@class='toast-title'][contains(.,'Saved')]")), "Failed to make booking");

            }

            extentReport.success("Booked successfully");

        }

        @AfterTest
        public void tearDown() {
            extentReport.onFinish();
            driver.quit();
        }



    }





