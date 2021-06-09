package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public enum Frames {

    GFXLogonFrame,
    GFXTaskFrame,
    GFXDHPageFrame,
    dlgLoanApp,
    URLA_Dyndlg,
    WGS_URLA_AddPartyInfo,
    PartyChildDynDlg;

    public WebElement GFXLogonFrame(){
        return Base.getDriver().findElement(By.id(GFXLogonFrame.toString()));
    }
    public WebElement GFXTaskFrame(){
     return Base.getDriver().findElement(By.id(GFXTaskFrame.toString()));
    }
    public WebElement GFXDHPageFrame(){
        return Base.getDriver().findElement(By.id(GFXDHPageFrame.toString()));
    }
    public WebElement dlgLoanApp(){
        return Base.getDriver().findElement(By.id(dlgLoanApp.toString()));
    }
    public WebElement URLA_Dyndlg(){
        return Base.getDriver().findElement(By.id(URLA_Dyndlg.toString()));
    }
    public WebElement WGS_URLA_AddPartyInfo(){
        return Base.getDriver().findElement(By.id(WGS_URLA_AddPartyInfo.toString()));
    }
    public WebElement PartyChildDynDlg(){
        return Base.getDriver().findElement(By.id(PartyChildDynDlg.toString()));
    }
}
