package Methods.Profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by yanagusti on 2/20/17.
 */
public class MyProfile {

    public void openPersonalInfo(WebDriver driver) {
        driver.findElement(By.linkText("My Profile")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id='content']/div/div[1]/h2")).isDisplayed();

    }

    public void changePersonalInfo(WebDriver driver) {
        driver.findElement(By.linkText("My Profile")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("user_first_name")).clear();
        driver.findElement(By.id("user_first_name")).sendKeys("Test");
        driver.findElement(By.id("user_last_name")).clear();
        driver.findElement(By.id("user_last_name")).sendKeys("Test");
        driver.findElement(By.id("user_company")).clear();
        driver.findElement(By.id("user_company")).sendKeys("Test");
        driver.findElement(By.cssSelector("span.dd-pointer.dd-pointer-down")).click();
        driver.findElement(By.linkText("Algeria")).click();
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.id("personal_info_notice")).isDisplayed();
    }

    public void emptyPersonalInfo(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.linkText("My Profile")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.id("user_first_name")).clear();
        driver.findElement(By.id("user_last_name")).clear();
        driver.findElement(By.id("user_company")).clear();
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.name("commit")).click();
        WebElement errorMessage = driver.findElement(By.xpath("//*[@id='edit_user_24']/div[4]/div[2]/label"));
        assertTrue(errorMessage.getText().contains("can't be blank"));
    }
}
