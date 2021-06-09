package com.qa.pages;

import components.Base;
import components.CommonFunctions;
import components.Frames;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PartyGatewayPage extends Base {
    public Frames frames=Frames.GFXLogonFrame;

    public PartyGatewayPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.ID,using = "BorrowerFirstName_BORROWER_SUBSET")
    private WebElement borrowerFirstName;


    @FindBy(how= How.ID,using = "BorrowerLastName_BORROWER_SUBSET")
    private WebElement borrowerLastName;


    @FindBy(how= How.ID,using = "BorrowerSSN_BORROWER_SUBSET")
    private WebElement borrowerSSN;


    @FindBy(how= How.ID,using = "BorrowerPhone_BORROWER_SUBSET")
    private WebElement borrowerHomePhoneNumber;


    @FindBy(how= How.ID,using = "BorrowerDOB_BORROWER_SUBSET")
    private WebElement borrowerDOB;


    @FindBy(how= How.ID,using = "Marital_Status")
    private WebElement borrowerMaritalStatus;

   /* public WebElement GFXTaskFrame(){
        return Base.getDriver().findElement(By.id(frames.GFXTaskFrame.toString()));
    }
    public WebElement GFXDHPageFrame(){
        return Base.getDriver().findElement(By.id(frames.GFXDHPageFrame.toString()));
    }
    public WebElement dlgLoanApp(){
        return Base.getDriver().findElement(By.id(frames.dlgLoanApp.toString()));
    }
    public WebElement URLA_Dyndlg(){
        return Base.getDriver().findElement(By.id(frames.URLA_Dyndlg.toString()));
    }
    public WebElement WGS_URLA_AddPartyInfo(){
        return Base.getDriver().findElement(By.id(frames.WGS_URLA_AddPartyInfo.toString()));
    }
    public WebElement PartyChildDynDlg(){
        return Base.getDriver().findElement(By.id(frames.PartyChildDynDlg.toString()));
    }*/

    public void navigateToPersonalDetailsFrame(){
        CommonFunctions.swithToDefaultFrame();
        CommonFunctions.swithToParentFrame(frames.GFXTaskFrame());
        CommonFunctions.swithToInsideFrame(frames.GFXDHPageFrame());
        CommonFunctions.swithToInsideFrame(frames.dlgLoanApp());
        CommonFunctions.swithToInsideFrame(frames.URLA_Dyndlg());
        CommonFunctions.swithToInsideFrame(frames.WGS_URLA_AddPartyInfo());
        CommonFunctions.swithToInsideFrame(frames.PartyChildDynDlg());
    }

    public void insertBorrowerFirstName(String firstName){
        navigateToPersonalDetailsFrame();
        CommonFunctions.insertText(borrowerFirstName,firstName);
    }
    public void insertBorrowerLastName(String lastName){
       // navigateToPersonalDetailsFrame();
        CommonFunctions.insertText(borrowerLastName,lastName);
    }
    public void insertBorrowerSSN(String ssn){
       // navigateToPersonalDetailsFrame();
        CommonFunctions.insertText(borrowerSSN,ssn);
    }

}
