package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class HerokuHomePage {
    public HerokuHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = "#content ul a")
    public List<WebElement> homePageLinks;

    public void clickOnHomePageText(String text){
        for(WebElement link : homePageLinks){
            if(link.getText().equals(text)){
                link.click();
                break;
            }
        }
    }
}
