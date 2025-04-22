package seleniumEssecials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileUpload {

    @Test
    public void myTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/MyProg/imp/dragAndDrop2.html");

        // t shirts of men -->

        WebElement fileUpload = driver.findElement(By.xpath("//input[@type='file']"));

        fileUpload.sendKeys("D:\\Scriptinglogic docs\\class Activities\\Selenium\\Java\\collections.pptx");





    }
}
