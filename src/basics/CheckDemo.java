package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/amol.html");

        WebElement checkJava = driver.findElement(By.id("check0"));
        WebElement checkSelenium = driver.findElement(By.id("check1"));
        WebElement checkCucumber = driver.findElement(By.id("check2"));

        Thread.sleep(4000);

        if (checkJava.isSelected())
            checkJava.click();

        if (checkSelenium.isSelected())
            checkSelenium.click();

        if (checkCucumber.isSelected())
            checkCucumber.click();


    }

}
