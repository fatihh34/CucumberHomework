package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class BlueRentalCarPage {

    public BlueRentalCarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='formBasicPassword']")
    public WebElement password;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement loginButton2;

    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement loginAssert;

    @FindBy(xpath = "(//*[@class='dropdown-item'])[3]")
    public WebElement logoutButton;

    @FindBy(xpath = "//*[@class='ajs-button ajs-ok']")
    public WebElement okButton;

}
