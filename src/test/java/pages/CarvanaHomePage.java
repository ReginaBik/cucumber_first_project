package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class CarvanaHomePage {
    public CarvanaHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

  // @FindBy(xpath = "//div[@class='HeaderMenustyles__HeaderItems-ogb5qa-1 dewPuX']/*[contains(@data-qa, 'menu')]")
    //public List<WebElement> headerMenuItems;

    @FindBy(css = "div[data-qa='header-items']>a")
    public List<WebElement> menuHeaderLinks;

    @FindBy(css = "span.kAQuLc")
    public WebElement financing;

    @FindBy(css = ".ewpFSy>a")
    public List<WebElement> financingDropdownLinks;

    public void clickOnHeaderLink(String linkText){
        for (WebElement link : menuHeaderLinks) {
            if (link.getText().equals(linkText)){
                link.click();
                break;
            }
        }
    }


    public void clickOnFinancialDropdownLinks(String linkText){
        for (WebElement link : financingDropdownLinks) {
            if (link.getText().equals(linkText)){
                link.click();
                break;
            }
        }
    }



}
