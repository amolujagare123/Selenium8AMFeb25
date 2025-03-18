package AssertionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AddCustomer {

    @Test
    public void addCustomerTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");


        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        //  driver.findElement(By.linkText("Add Customer")).click();
        WebElement lnkAddCustomer = driver.findElement(By.partialLinkText("Add C"));
        System.out.println(lnkAddCustomer.getText());

        lnkAddCustomer.click();

       /* driver.findElement(By.name("name")).sendKeys("Sony");
        driver.findElement(By.name("address")).sendKeys("XYZ");
        driver.findElement(By.name("contact1")).sendKeys("787878787");
        driver.findElement(By.name("contact2")).sendKeys("1223444556");*/
        driver.findElement(By.name("Submit")).click();

        String expected = "Please enter a Customer Name".toUpperCase();

        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//label[@for='name']")).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no error message");

    }

    @Test
    public void addCustomerTest2()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");


        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        //  driver.findElement(By.linkText("Add Customer")).click();
        WebElement lnkAddCustomer = driver.findElement(By.partialLinkText("Add C"));
        System.out.println(lnkAddCustomer.getText());

        lnkAddCustomer.click();

        driver.findElement(By.name("name")).sendKeys("Snehal12");
        driver.findElement(By.name("address")).sendKeys("XYZ");
        driver.findElement(By.name("contact1")).sendKeys("787878787");
        driver.findElement(By.name("contact2")).sendKeys("1223444556");
        driver.findElement(By.name("Submit")).click();

       // String expected = "[ Snehal1 ] Customer Details Added !";
        String expected = "Customer Details Added";

        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();
        }
        catch (Exception e)
        {

        }

        boolean result = actual.contains(expected);

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

       // Assert.assertEquals(actual,expected,"incorrect or no error message");
        Assert.assertTrue(result,"incorrect or no success message");

    }

    @Test
    public void addCustomerTest3()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");


        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        //  driver.findElement(By.linkText("Add Customer")).click();
        WebElement lnkAddCustomer = driver.findElement(By.partialLinkText("Add C"));
        System.out.println(lnkAddCustomer.getText());

        lnkAddCustomer.click();

        String name = "Snehal13";

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys("XYZ");
        driver.findElement(By.name("contact1")).sendKeys("787878787");
        driver.findElement(By.name("contact2")).sendKeys("1223444556");
        driver.findElement(By.name("Submit")).click();

        String expected = "[ "+name+" ] Customer Details Added !";


        String actual = "";
        try {
            actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();
        }
        catch (Exception e)
        {

        }

        boolean result = actual.contains(expected);

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no success message");


    }

    @Test
    public void addCustomerTest4()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");


        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        //  driver.findElement(By.linkText("Add Customer")).click();
        WebElement lnkAddCustomer = driver.findElement(By.partialLinkText("Add C"));
        System.out.println(lnkAddCustomer.getText());

        lnkAddCustomer.click();

        String name = "Snehal13";

     //   driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys("XYZ");
        driver.findElement(By.name("contact1")).sendKeys("78");
        driver.findElement(By.name("contact2")).sendKeys("12");
        driver.findElement(By.name("Submit")).click();

        String expected1 = "Please enter a Customer Name".toUpperCase();
        String expected2 = "Please enter at least 3 characters.".toUpperCase();
        String expected3 = "Please enter at least 3 characters.".toUpperCase();

        ArrayList<String> expected = new ArrayList<>() {{

                    add(expected1);
                    add(expected2);
                    add(expected3);
        }};

        ArrayList<String> actual = new ArrayList<>();

        try {
            List<WebElement> wbList = driver.findElements(By.xpath("//*[@class='error']"));

            actual.add(wbList.get(0).getText());
            actual.add(wbList.get(1).getText());
            actual.add(wbList.get(2).getText());
        }
        catch (Exception e)
        {

        }



        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"incorrect or no success message");


    }
}
