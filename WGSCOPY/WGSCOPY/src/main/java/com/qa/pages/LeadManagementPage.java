package com.qa.pages;

import components.Base;
import components.CommonFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LeadManagementPage extends Base {

    public LeadManagementPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(how= How.ID, using="GFXTaskFrame")
    private WebElement GFXTaskFrame;

    @FindBy(how= How.ID, using="WorkflowItemFrame")
    private WebElement WorkflowItemFrame;

    @FindBy(how= How.XPATH, using="//select[contains(@id,'resolution')]")
    private WebElement resolutionDropdown;

    @FindBy(how= How.XPATH, using="//iframe[@src='WGS_WORKFLOW_C2_RESOLVECONFIRM.htm']")
    private WebElement resolutionFrame;

    @FindBy(how= How.ID, using="wf_res_RemarkEdit")
    private WebElement workFlowRemarksSection;

    @FindBy(how= How.ID, using="wf_res_ResolveButton")
    private WebElement workFlowResolutionCompleteButton;

    public void selectResolution(String resolutionValue) throws InterruptedException {
        CommonFunctions.swithToParentFrame(GFXTaskFrame);
        Thread.sleep(15000);
        CommonFunctions.swithToInsideFrame(WorkflowItemFrame);
        CommonFunctions.click(resolutionDropdown);
        CommonFunctions.clickUsingSelect(resolutionDropdown,resolutionValue,"byvisibletext");
    }

    public void completeWorkFlow(String comment){
        CommonFunctions.swithToParentFrame(resolutionFrame);
        CommonFunctions.insertText(workFlowRemarksSection,comment);
        CommonFunctions.click(workFlowResolutionCompleteButton);
    }
}
