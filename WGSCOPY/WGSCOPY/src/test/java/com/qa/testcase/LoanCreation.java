package com.qa.testcase;

import com.codoid.products.exception.FilloException;
import com.qa.pages.DashBoardPage;
import com.qa.pages.LeadManagementPage;
import components.Base;
import components.ReportManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.FilloReader;

public class LoanCreation extends Base {



    @Test(dataProvider = "createLoan")
    public void createRetailLoan(String loanType,String resolutionValue) throws InterruptedException {
        Logger log= LogManager.getLogger(this.getClass().getName());
        DashBoardPage dashBoardPage=new DashBoardPage(getDriver());
        LeadManagementPage leadManagementPage=new LeadManagementPage(getDriver());
        dashBoardPage.navigateToGFXLoanSelectorFrame();
        dashBoardPage.createRetailLoan(loanType);
        ReportManager.extentTestNode.info("Create button is clicked and retail loan is selected");
        log.error("Create button is clicked and retail loan is selected");
        leadManagementPage.selectResolution(resolutionValue);
        ReportManager.extentTestNode.info(resolutionValue +" resolution is selected");
        log.info(resolutionValue +" resolution is selected");
        Thread.sleep(10000);
        leadManagementPage.completeWorkFlow("Leadmanagement completed");
        ReportManager.extentTestNode.pass("Leadmanagement completed");
        log.info("Leadmanagement completed");

    }

    @DataProvider(name="createLoan")
    public Object[][] createLoan() throws FilloException {

        return new Object[][]{{FilloReader.readingExcelFile("loanType"),FilloReader.readingExcelFile("resolutionValue")}};
    }
}
