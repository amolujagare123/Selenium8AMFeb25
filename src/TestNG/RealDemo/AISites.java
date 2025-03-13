package TestNG.RealDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AISites {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
          driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openAI() {
        driver.get("https://openai.com");
    }

    @Test
    public void deepMind() {
        driver.get("https://www.deepmind.com");
    }

    @Test
    public void huggingFace() {
        driver.get("https://huggingface.co");
    }

    @Test
    public void nvidiaAI() {
        driver.get("https://www.nvidia.com/en-us/ai/");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

