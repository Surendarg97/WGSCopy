package com.qa.pages;

import components.Base;
import components.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class TaskPage extends Base {

    public TaskPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public List<String> workBenchList=new ArrayList<>();
    public List<String> URLAFormList=new ArrayList<>();

    @FindBy(how= How.XPATH, using="//table[@id='taskTable']//tr/td")
    public List<WebElement> workBenchListXpath;



    @FindBy(how=How.ID,using="GFXTaskFrame")
    private WebElement GFXTaskFrame;


    @FindBy(how=How.ID,using="GFXDHPageFrame")
    private WebElement GFXDHPageFrame;

    @FindBy(how=How.ID,using="dlgLoanApp")
    private WebElement dlgLoanApp;

    @FindBy(how=How.XPATH,using="//ul[@id='mainNavFrame']/li/input")
    private List<WebElement> URLAFormTabsList;




    public List<String> getWorkBenchList(){
        CommonFunctions.swithToParentFrame(GFXTaskFrame);
        System.out.println(workBenchListXpath);
       for (int i=0;i<workBenchListXpath.size();i++) {

           workBenchList.add(workBenchListXpath.get(i).getAttribute("screenname"));
        }

        return workBenchList;
    }

    public void selectWorkBench(String workBenchName){

        getWorkBenchList();

        for(int i=0;i<workBenchList.size();i++){

            if(workBenchList.get(i).equalsIgnoreCase(workBenchName)){

                CommonFunctions.swithToParentFrame(GFXTaskFrame);
                getDriver().findElement(By.xpath("//table[@id='taskTable']//tr/td[@screenname='"+workBenchName+"']")).click();


            }
        }
    }

    public List<String> getURLAFormList(){
        CommonFunctions.swithToParentFrame(GFXTaskFrame);
        CommonFunctions.swithToInsideFrame(GFXDHPageFrame);
        CommonFunctions.swithToInsideFrame(dlgLoanApp);

        for (WebElement URLAFormTab:URLAFormTabsList) {

            URLAFormTabsList=getDriver().findElements(By.xpath("//ul[@id='mainNavFrame']/li/input"));

            URLAFormList.add(URLAFormTab.getAttribute("value"));
        }

        return URLAFormList;
    }


    public void selectURLAFormTab(String URLAFormTab,String URLAFormTabSection){
        getURLAFormList();

        for(int i=0;i<URLAFormList.size();i++){

            if(URLAFormList.get(i).equalsIgnoreCase(URLAFormTab)){

                getDriver().findElement(By.xpath("//ul[@id='mainNavFrame']/li/input[@value='"+URLAFormTab+"']")).click();

                if(!URLAFormTabSection.equalsIgnoreCase("")) {
                    getDriver().findElement(By.xpath("//ul[@id='mainNavFrame']/li/input[@value='" + URLAFormTab + "']/parent::li//li/input[@value='" + URLAFormTabSection + "']")).click();
                    CommonFunctions.moveCursorBySomePoint();
                }
            }
        }
    }


}
