package TestNG.RealDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites extends Base {


    @Test
    public void linkedIn() {
        driver.get("https://www.linkedin.com/jobs");
    }

    @Test
    public void indeed() {
        driver.get("https://www.indeed.com");
        Assert.assertEquals(driver.getTitle(),
                "indeed job site","this is not indeed site");
    }

    @Test
    public void glassdoor() {
        driver.get("https://www.glassdoor.com");
    }

    @Test
    public void monster() {
        driver.get("https://www.monster.com");
    }


}
