package TestNG;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest2 {
    WebDriver driver;

    @BeforeMethod // this method will execute before every test method
    public void openBrowser()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod // this method will execute after every test method
    public void closeBrowser()
    {
        driver.quit();
    }

    @Test
    public void loginTest1()
    {

        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

    }

    @Test
    public void loginTest2()
    {

        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("dsdsds");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("sdsds");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

    }

    @Test
    public void loginTest3()
    {

        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

    }
}
