package seleniumEssecials;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertsDemo {

    @Test
    public void alertTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/MyProg/imp/dragAndDrop2.html");

       // driver.findElement(By.xpath("file:///D:/MyProg/imp/dragAndDrop2.html")).click();
        driver.findElement(By.xpath("//button[text()='Try it']")).click();

       /* JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript("arguments[0].click()",closePopup);*/

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        Thread.sleep(4000);
        alert.dismiss();
    }
}
