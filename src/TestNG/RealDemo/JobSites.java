package TestNG.RealDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
         driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void linkedIn() {
        driver.get("https://www.linkedin.com/jobs");
    }

    @Test
    public void indeed() {
        driver.get("https://www.indeed.com");
    }

    @Test
    public void glassdoor() {
        driver.get("https://www.glassdoor.com");
    }

    @Test
    public void monster() {
        driver.get("https://www.monster.com");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
