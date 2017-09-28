package heruTests.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Primary {

    public WebDriver driver;

    public Primary(WebDriver driver) { this.driver = driver; }

    public void open(String url) { driver.get(url); }

    public WebElement find(By locator) { return driver.findElement(locator); }

    public void click(By locator) { find(locator).click(); }

    public void write(String inputText, By locator){ find(locator).sendKeys(inputText); }

    public void waitForVisible(By locator) { WebElement el = new WebDriverWait(driver, 10).
            until(ExpectedConditions.visibilityOfElementLocated(locator)); }

    public void waitForVisibleDeclareTimeOut(By locator, int timeOut) { WebElement el = new WebDriverWait(driver,
            timeOut).until(ExpectedConditions.visibilityOfElementLocated(locator)); }

    public void waitAndClick(By locator) {
        waitForVisible(locator);
        driver.findElement(locator).click();
    }

    public void moveToFrame(String frameID){ driver.switchTo().frame(frameID); }

    public Boolean isSelected(By locator)  { return find(locator).isSelected(); }

    public Boolean isVisible(By locator) {
        try {
            return find(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException exception) {
            return false;
        }
    }
}