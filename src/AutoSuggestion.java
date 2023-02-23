import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestion {
    public static void main(String[] args) {
        System.setProperty("webdriver,chrome,driver","utils/chromedriver_mac64/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Iphone");

        String xp="//span[contains(text(),'Iphone')]";
        List<WebElement> allIphones =driver.findElements(By.xpath(xp));

        for (WebElement Iphone: allIphones){
            System.out.println(Iphone.getText());
        }
    }
}
