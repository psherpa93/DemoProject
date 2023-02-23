package JunitExample;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Junit_example2 {
    WebDriver driver;
    String BaseURL="http://tutorialsninja.com/demo/index.php?route=account/login";

    @Before
    public void M2()
    {
        System.out.println("This is the  M2 Method");

    System.setProperty("webdriver.chrome.driver", "utils/chromedriver_mac64/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(BaseURL);
    }
    @Test
    public void M1() {
        System.out.println("This is the (Test annotation)M1 Method");
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS)

    driver.findElement(By.name("email")).sendKeys("psherpa93@gmail.com");
    driver.findElement(By.name("password")).sendKeys("sherpa23");

    driver.findElement(By.xpath("//input[@type='submit']")).click();

    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        /* //h2[text()='My Account']      */
    String actual = driver.findElement(By.xpath("//h2[text()='My Orders']")).getText();

    String expected = "My Account";
    Assert.assertEquals(expected, actual);

     System.out.println("Assert is Executed");
    }
    @After
    public void M3() throws InterruptedException {
        System.out.println("This is the (After annotation) M3 Method");

        Thread.sleep(5000);
        driver.close();
        driver.quit();
    }

}

