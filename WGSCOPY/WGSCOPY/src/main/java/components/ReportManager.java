package components;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportManager extends Base {

    public static ExtentReports extent=new ExtentReports();
    public static ExtentSparkReporter sparkReporter=new ExtentSparkReporter("E:\\LocalGitHubRepository\\IntelliJIDEAProjects\\WGSCOPY\\WGSCOPY\\src\\Reports\\extentreport.html");
    public static ExtentTest extentTest;
    public static ExtentTest extentTestNode;

    public static void extentAttachReport(){
        extent.attachReporter(sparkReporter);


       // extent.flush();
    }



    public static ExtentTest createExtentTestNode(String methodName){
        extentTestNode=extentTest.createNode(methodName);
        return extentTestNode;
    }
    /*public static void extentCreateNode(String logging){
        extentTestNode=extentTest.createNode(logging);

    }*/
}
