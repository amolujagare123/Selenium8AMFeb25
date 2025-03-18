package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class UserCreation {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/study/user1.html");

        List<WebElement> wbList = driver.findElements(By.className("input-field"));

        System.out.println(wbList.size());







    }

}
