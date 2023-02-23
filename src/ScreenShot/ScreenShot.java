package ScreenShot;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void main(String[] args) throws WebDriverException, IOException {
        System.setProperty("webdriver, chrome, driver", "utils/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        TakesScreenshot ts = (TakesScreenshot)driver;
        File f= ts.getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(f,new File(".utils/Screenshot/screen.jpg"));

        driver.close();
    }

}
