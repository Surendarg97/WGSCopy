package com.qa.testcase;

import com.qa.pages.PartyGatewayPage;
import components.Base;
import org.testng.annotations.Test;

public class PartyGateway extends Base {

    @Test
    public void enteringBorrowerDetails() throws InterruptedException {
        Thread.sleep(10000);
        PartyGatewayPage partyGatewayPage=new PartyGatewayPage(getDriver());
        partyGatewayPage.insertBorrowerFirstName("Alice");
        partyGatewayPage.insertBorrowerLastName("Firstimer");
        partyGatewayPage.insertBorrowerSSN("991919991");
    }
}
