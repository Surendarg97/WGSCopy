package com.qa.pages;

import components.Base;
import components.Frames;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PartyGatewayPage extends Base {

    public Frames frames;

    public PartyGatewayPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

   /* GFXTaskFrame
    GFXDHPageFrame
    dlgLoanApp
    URLA_Dyndlg
    WGS_URLA_AddPartyInfo
    PartyChildDynDlg*/



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
}
