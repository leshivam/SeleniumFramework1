package ProjectSeleniumFramework;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

//@Test
//@Description("Open VWO, Login  and scroll function")
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollBar {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
         driver.get("https://app.vwo.com");
         driver.findElement(By.xpath("//*[@id=\"login-username\"]")).sendKeys("testcgptf@gmail.com");
         driver.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("");
         driver.findElement(By.xpath("//*[@id=\"js-login-btn\"]")).click();







    }
}
