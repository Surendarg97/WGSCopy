package com.qa.pages;

import components.Base;
import components.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends Base {

    public DashBoardPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

/*    @FindBy(how=How.ID,using="GFXLoanSelectorFrame")
    private WebElement GFXLoanSelectorFrame;*/


    @FindBy(how=How.CLASS_NAME,using="gFXLoanSelectorFrame")
    public WebElement gFXLoanSelectorFrame;

    @FindBy(how= How.XPATH, using="//div[@id='UD_ContainerTree']//div[@id='udPluginControlContainer']/div/div")
    private WebElement createNewLoanButton;

    @FindBy(how=How.ID,using="WGS_UserDashboardCreateLoan.htm")
    private WebElement userDashboardCreateLoanFrame;

    @FindBy(how=How.ID,using="lsProcCombo")
    private WebElement selectAType;

    //Select a Type Retail Loan

    public void navigateToGFXLoanSelectorFrame(){
        CommonFunctions.swithToParentFrame(gFXLoanSelectorFrame);
    }

    public void createRetailLoan(String loanType){
        CommonFunctions.click(createNewLoanButton);
        CommonFunctions.swithToInsideFrame(userDashboardCreateLoanFrame);
        CommonFunctions.waitTiming(selectAType);
        CommonFunctions.clickUsingSelect(selectAType,loanType,"byvisibletext");
    }

}
