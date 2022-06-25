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

   @FindBy(xpath = "//div[@class='HeaderMenustyles__HeaderItems-ogb5qa-1 dewPuX']/*[contains(@data-qa, 'menu')]")
    public List<WebElement> headerMenuItems;

    public void clickOnHeaderMenuItems(String itemText){
        for(WebElement item : headerMenuItems){
            if(item.getText().equals(itemText)){
                item.click();
                break;
            }
        }
    }


}
