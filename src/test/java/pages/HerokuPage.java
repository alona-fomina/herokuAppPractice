package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.Calendar;
import java.util.List;

public class HerokuPage {

    public HerokuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "img[src='asdf.jpg']")
    public WebElement image1;

    @FindBy(css = "img[src='hjkl.jpg']")
    public WebElement image2;

    @FindBy(css = "img[src='img/avatar-blank.jpg']")
    public WebElement image3;

    @FindBy(css = "img[alt='User Avatar']")
    public List<WebElement> avatarImages;

    @FindBy(css = ".figcaption h5")
    public List<WebElement> nameHeaders;

    @FindBy(css = ".figcaption a")
    public List<WebElement> nameLinks;

}
