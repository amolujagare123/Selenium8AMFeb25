package CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        WebElement txtUsername = driver.findElement(By.cssSelector("#login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.cssSelector("#login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        btnLogin.click();


        //  driver.findElement(By.linkText("Add Customer")).click();
      /*  WebElement lnkAddCustomer = driver.findElement(By.xpath("//a[@href='add_customer.php']"));
        System.out.println(lnkAddCustomer.getText());

        lnkAddCustomer.click();

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sony");
        driver.findElement(By.xpath("//*[@name='address']")).sendKeys("XYZ");
        driver.findElement(By.xpath("//input[@name='contact1']")).sendKeys("787878787");
        driver.findElement(By.xpath("//input[@name='contact2']")).sendKeys("1223444556");
        driver.findElement(By.xpath("//input[@type='submit']")).click();*/
    }
}
