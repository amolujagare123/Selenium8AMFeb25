package ReportsDemo.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ForExtentReport {

    public static String getScreenshot(WebDriver driver) throws IOException {

        // 1. create the object reference of TakesScreenshots
        // assign the driver, type cast driver into TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs() using ts
        File srcfile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";
        // 3. copy the file object into a real image file
        FileUtils.copyFile(srcfile, new File("Reports//Screenshots//"+fileName));

        return fileName;


    }


    public static ExtentReports initExtent()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setReportName("Stock Management project");
        reporter.config().setDocumentTitle("Regression testing");

        extent.setSystemInfo("OS", "Windows 11");
        extent.setSystemInfo("Browser", "Chrome 120.0");
        extent.setSystemInfo("Tester", "John Doe");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Build Version", "v1.2.3");

        return extent;
    }
}
