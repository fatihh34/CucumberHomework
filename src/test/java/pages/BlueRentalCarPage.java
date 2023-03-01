package pages;

import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class BlueRentalCarPage {

    public BlueRentalCarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
