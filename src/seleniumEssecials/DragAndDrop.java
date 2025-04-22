package seleniumEssecials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

    @Test
    public void myTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/MyProg/imp/dragAndDrop2.html");

        // t shirts of men -->

        WebElement source = driver.findElement(By.xpath("//div[text()='Item 1']"));
        WebElement target = driver.findElement(By.xpath("//div[text()='Drop Here']"));

        Thread.sleep(4000);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,target).perform();

        Thread.sleep(4000);
        actions.contextClick().perform();




    }
}
