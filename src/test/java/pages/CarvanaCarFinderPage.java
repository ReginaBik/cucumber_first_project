package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class CarvanaCarFinderPage {
    public CarvanaCarFinderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".leftSide h1")
    public WebElement h1Header;

    @FindBy(css = ".leftSide h3")
    public WebElement h3Header;
}
