package seleniumEssecials;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AsianPaints {

    @Test
    public void myTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.asianpaints.com/");

        // t shirts of men -->

        WebElement closePopup = driver.findElement(By.xpath("// button[@class='btn-close']/img[@alt='close icon']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript("arguments[0].click()",closePopup);
  //      closePopup.click();

    }
}
