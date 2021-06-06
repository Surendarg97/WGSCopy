package com.qa.pages;

import components.Base;
import components.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginLandingPage extends Base {

    public LoginLandingPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="GFXLogonFrame")
    private WebElement GFXLogonFrame;

    @FindBy(id="username")
    private WebElement userName;

    @FindBy(name="password")
    private WebElement passWord;

    @FindBy(className = "logonbtn")
    private WebElement logOn;

    @FindBy(how= How.ID, using="grpselect")
    private WebElement grpselectFrame;

    @FindBy(how= How.ID, using="selectGroup")
    private WebElement selectGroup;

    @FindBy(how= How.ID, using="btnOk")
    private WebElement btnOk;

/*    @FindBy(id="grpselect")
    Private WebElement grpselectFrame;

    @FindBy(id="selectGroup");
    Private WebElement selectGroup;

    @FindBy(id="btnOk")
    Private WebElement btnOk;*/

    //Entering user name
    public void enterUserName(String userName){
        CommonFunctions.swithToParentFrame(GFXLogonFrame);
        CommonFunctions.insertText(this.userName,userName);
    }

    public void passWord(String passWord){
        CommonFunctions.insertText(this.passWord,passWord);
    }

    public void clickLogOnButton(){
        CommonFunctions.click(logOn);
    }

    public void selectSecurityGroup(String value) throws InterruptedException {
        CommonFunctions.swithToParentFrame(GFXLogonFrame);
        CommonFunctions.swithToInsideFrame(grpselectFrame);
        CommonFunctions.waitTiming(selectGroup);
        CommonFunctions.clickUsingSelect(selectGroup,value,"byvalue");
        CommonFunctions.click(btnOk);
    }
}
