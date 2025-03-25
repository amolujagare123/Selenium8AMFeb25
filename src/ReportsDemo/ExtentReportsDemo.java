package ReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static ReportsDemo.util.ForExtentReport.getScreenshot;

public class ExtentReportsDemo {

   ExtentReports extent;

    @BeforeClass
    public void initExtentReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setReportName("Stock Management project");
        reporter.config().setDocumentTitle("Regression testing");

        extent.setSystemInfo("OS", "Windows 11");
        extent.setSystemInfo("Browser", "Chrome 120.0");
        extent.setSystemInfo("Tester", "John Doe");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Build Version", "v1.2.3");
    }

    @AfterClass
    public void writeToReport()
    {
        extent.flush();
    }

    @Test
    public void loginTest1() throws IOException {
        ExtentTest test = extent.createTest("Valid login");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("Username is Entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");

        test.info("Password is Entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("Login button is clicked");

        String expected = "Dashboard";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();
        }
        catch (Exception e)
        {

        }


        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        try {
            Assert.assertEquals(actual,expected,"This is not the Dashboard");
            test.pass(" this test is passed ");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./Screenshots/"+getScreenshot(driver));
        }

    }

    @Test
    public void loginTest2() throws IOException {
        ExtentTest test = extent.createTest("invalid login");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("Username is Entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        test.info("Password is Entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("Login button is clicked");

        String expected = "Wrong Username or Password";
        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        }
        catch (Exception e)
        {

        }


        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        try {
            Assert.assertEquals(actual,expected,"incorrect or no error message");
            test.pass("this test is passed ");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./Screenshots/"+getScreenshot(driver));
        }

    }

    @Test
    public void loginTest3() throws IOException {
        ExtentTest test = extent.createTest("blank login");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        test.info("Username is Entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        test.info("Password is Entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("Login button is clicked");

        String expected1 = "Please enter a username".toUpperCase();
        String expected2 = "Please provide a password".toUpperCase();

        ArrayList<String> expected = new ArrayList<>();
        expected.add(expected1);
        expected.add(expected2);

        ArrayList<String> actual = new ArrayList<>();

        try {
            List<WebElement> wbList = driver.findElements(By.xpath("//*[@class='error']"));

            actual.add(wbList.get(0).getText());
            actual.add(wbList.get(1).getText());

        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);


        try {
            Assert.assertEquals(actual,expected,"incorrect or no error message");
            test.pass("this test is passed ");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage());
            test.addScreenCaptureFromPath("./Screenshots/"+getScreenshot(driver));
        }

    }
}
