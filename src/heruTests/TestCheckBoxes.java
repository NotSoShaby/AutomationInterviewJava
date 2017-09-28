package heruTests;

import heruTests.pageobjects.CheckBoxesPage;
import heruTests.pageobjects.mainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import static org.junit.Assert.*;


public class TestCheckBoxes {

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
    public void CheckingBoxes() {
        // Test to check the checking of the check buttons (pon intended)

        CheckBoxesPage CheckBoxesPage = Main.getCheckBoxesPage();

        assertTrue("CheckBox 1 is checked when entering the page", !CheckBoxesPage.checkIfCBIsSelected(0));
        assertTrue("CheckBox 2 is not checked when entering the page", CheckBoxesPage.checkIfCBIsSelected(1));

        CheckBoxesPage.clickCheckBox(0);
        assertTrue("Trying to check CheckBox 1 failed", CheckBoxesPage.checkIfCBIsSelected(0));
        CheckBoxesPage.clickCheckBox(1);
        assertTrue("Trying to un-check CheckBox 2 failed", !CheckBoxesPage.checkIfCBIsSelected(1));



    }
    @After
    public void tearDown() { driver.quit();}
}
