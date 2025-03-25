package ReportsDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotDemo2 {


    @Test
    public void loginTest1() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com/");


        WebElement element = driver.findElement(By.xpath("//div[@class='_8esl']"));

        // 2. call the method getScreenshotAs() using ts
        File srcfile = element.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyyddMM_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";
        // 3. copy the file object into a real image file
        FileUtils.copyFile(srcfile, new File("Screenshots//"+fileName));


    }
}
