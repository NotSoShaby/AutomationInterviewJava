package heruTests.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DynamicLoadingPage extends Primary {
    //CheckBoxes page element

    private static final By PAGEFOOTERWAITEL = By.id("page-footer");
    private static final By RENDEREDELEMENTBUTTON = By.cssSelector("a[href='/dynamic_loading/2']");
    private static final By HIDDENELEMENTBUTTON = By.cssSelector("a[href='/dynamic_loading/1']");

    public DynamicLoadingPage(WebDriver driver){
        super(driver);
        waitForVisible(PAGEFOOTERWAITEL);
    }


    public RenderedElementPage getRenderedElementPage() {
        waitAndClick(RENDEREDELEMENTBUTTON);
        RenderedElementPage page = new RenderedElementPage(this.driver);
        return page;
    }


    //TODO - public HiddenElementPage getiHidddenElementPage() {  } : currently irrelevant



}

