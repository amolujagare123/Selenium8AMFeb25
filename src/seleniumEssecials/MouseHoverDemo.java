package seleniumEssecials;

import io.reactivex.rxjava3.functions.Action;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverDemo {

    @Test
    public void myTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");

        // t shirts of men -->

        WebElement lnkMen = driver.findElement(By.xpath("//a[@class='desktop-main'][normalize-space()='Men']"));

        Thread.sleep(4000);
        Actions actions = new Actions(driver);

        actions.moveToElement(lnkMen).perform();

        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@data-reactid='31'][text()='T-Shirts']")).click();

    }
}
