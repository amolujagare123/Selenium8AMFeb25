package ReportsDemo.MyListeners;

import TestNG.RealDemo.Base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static ReportsDemo.util.ForExtentReport.getScreenshot;
import static ReportsDemo.util.ForExtentReport.initExtent;

public class MyExtentListeners extends Base implements ITestListener
{
    ExtentReports extent;
    ExtentTest test;
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart");

         test = extent.createTest(result.getMethod().getMethodName());
    }

    public  void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess");
        test.pass("This test is passed");
    }

  //  WebDriver driver;

    public  void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure");
        test.fail(result.getThrowable());
        try {
            test.addScreenCaptureFromPath("./Screenshots/"+getScreenshot(driver));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public  void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped");
        test.skip(result.getThrowable());
    }



    public  void onStart(ITestContext context) {
        System.out.println("onStart");

        if (extent==null)
           extent = initExtent();
    }

    public  void onFinish(ITestContext context) {
        System.out.println("onFinish");

        extent.flush();

    }

}
