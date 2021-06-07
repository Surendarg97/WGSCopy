package com.qa.testcase;

import com.qa.pages.TaskPage;
import components.Base;
import components.ReportManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class TaskRelatedAction extends Base {

    @Test
    public void selectWorkBench() throws InterruptedException {
        Thread.sleep(15000);
        TaskPage taskPage=new TaskPage(getDriver());
        Logger log= LogManager.getLogger(this.getClass().getName());

        taskPage.selectWorkBench("Loan Application");
        log.info("Loan application workbench is selected");
        ReportManager.extentTestNode.info("Loan application workbench is selected");

    }
}
