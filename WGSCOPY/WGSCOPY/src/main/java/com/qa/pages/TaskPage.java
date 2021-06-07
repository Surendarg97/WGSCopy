package com.qa.pages;

import components.Base;
import components.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TaskPage extends Base {

    public TaskPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public List<String> workBenchList=getWorkBenchList();

    @FindBy(how= How.XPATH, using="//table[@id='taskTable']//tr/td")
    private List<WebElement> workBenchListXpath;


    @FindBy(how=How.ID,using="GFXTaskFrame")
    private WebElement GFXTaskFrame;

    public List<String> getWorkBenchList(){
        CommonFunctions.swithToParentFrame(GFXTaskFrame);
        workBenchListXpath=getDriver().findElements(By.xpath("//table[@id='taskTable']//tr/td"));

        for (WebElement workBench:workBenchListXpath) {

            workBenchList.add(workBench.getAttribute("screenname"));
        }
        return workBenchList;
    }

    public void selectWorkBench(String workBenchName){

        for(int i=0;i<workBenchList.size();i++){

            if(workBenchList.get(i).equalsIgnoreCase(workBenchName)){

                CommonFunctions.swithToParentFrame(GFXTaskFrame);
                getDriver().findElement(By.xpath("//table[@id='taskTable']//tr/td[@screenname='"+workBenchName+"']")).click();


            }
        }
    }
}
