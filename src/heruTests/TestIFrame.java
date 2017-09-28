package heruTests;

import heruTests.pageobjects.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import static org.junit.Assert.*;


public class TestIFrame {

    private WebDriver driver;
    private mainPage Main;

    @Before
    public void setUp() {
        File pathBinary = new File("C:\\program files\\Mozilla Firefox\\firefox.exe");
        FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        System.setProperty("webdriver.gecko.driver", "C:\\Automation\\Drivers_and_config\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver(firefoxBinary, firefoxProfile);
        Main = new mainPage(driver);
    }

    @Test
    public void TestEnteringText() {
        // Test to check the checking of the check buttons (pon intended)

        String textToEnter = "This is an Interview for 5th dimention";

        FramesPage FramesPage = Main.getFramesPage();
        iFramePage iFramePage =  FramesPage.getiFramePage();

        iFramePage.InsertText(textToEnter);
        String currentText = iFramePage.getTextFromiFrame();
        assertTrue("The text in the box does not match the inset text", currentText.equals(textToEnter));

    }
    @After
    public void tearDown() { driver.quit();}
}
