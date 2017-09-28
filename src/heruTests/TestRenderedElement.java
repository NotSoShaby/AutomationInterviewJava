package heruTests;

import heruTests.pageobjects.CheckBoxesPage;
import heruTests.pageobjects.DynamicLoadingPage;
import heruTests.pageobjects.RenderedElementPage;
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


public class TestRenderedElement {

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
    public void TestRendering() {
        // Test to check the checking of the check buttons (pon intended)

        DynamicLoadingPage DynamicLoadingPage = Main.getDynamicLoadingPage();
        RenderedElementPage RenderedElementPage =  DynamicLoadingPage.getRenderedElementPage();

        RenderedElementPage.pressStart();
        assertTrue("Loader did not appear at all", RenderedElementPage.isLoaderVisible());
        RenderedElementPage.WaitForProcessTofinish();
        assertTrue("Finished message did not show", RenderedElementPage.isFinishMessageVisible());

    }
    @After
    public void tearDown() { driver.quit();}
}
