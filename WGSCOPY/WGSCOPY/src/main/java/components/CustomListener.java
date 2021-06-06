package components;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("onteststart");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("ontestsucess");

    }

    @Override
    public void onTestFailure(ITestResult result) {
        ReportManager.extentTestNode.fail(result.getThrowable().getMessage());
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("onstart");
       // ReportManager.extentTest=ReportManager.extent.createTest(context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onfinish");
        //ReportManager.extent.flush();
    }
}
