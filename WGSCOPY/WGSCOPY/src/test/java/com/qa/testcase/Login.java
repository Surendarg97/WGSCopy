package com.qa.testcase;

import com.codoid.products.exception.FilloException;
import com.qa.pages.LoginLandingPage;
import components.Base;
import components.ReportManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.FilloReader;

import java.io.IOException;

public class Login extends Base {

    @Test(dataProvider="loginDetails")
    public void login(String userName, String passWord, String securityRole) throws InterruptedException, IOException {
        Logger log= LogManager.getLogger(this.getClass().getName());
        ReportManager.extentTestNode.assignAuthor("Surendar").assignDevice("Personal").assignCategory("Learning");
        LoginLandingPage landingPage=new LoginLandingPage(getDriver());
        landingPage.enterUserName(userName);
        ReportManager.extentTestNode.info("username entered as "+userName);
        log.warn("username entered as "+userName);
        landingPage.passWord(passWord);
        ReportManager.extentTestNode.info("password entered as "+passWord);
        log.debug("password entered as "+passWord);
        landingPage.clickLogOnButton();
        ReportManager.extentTestNode.info("login button clicked");
        log.fatal("login button clicked");
        landingPage.selectSecurityGroup(securityRole);
        ReportManager.extentTestNode.pass("login successfull");
        log.error("login successfull");
        takeScreenshot();

       // ReportManager.flushingExtentReport();


}





    @DataProvider(name = "loginDetails")
    public Object[][] loginDetails() throws FilloException {
        Object[][] obj;
        obj = new Object[][]{{FilloReader.readingExcelFile("userName"),FilloReader.readingExcelFile("passWord"),FilloReader.readingExcelFile("securityRole")}};
        return obj;




}

}












