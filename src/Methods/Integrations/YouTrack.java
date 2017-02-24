package Methods.Integrations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sasha on 23.02.2017.
 */
public class YouTrack {
    public  void  addtrack(WebDriver driver){
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.linkText("You Track")).click();
        driver.findElement(By.id("you_track_setting_password")).clear();
        driver.findElement(By.id("you_track_setting_password")).sendKeys("246897531");
        driver.findElement(By.id("you_track_setting_login")).clear();
        driver.findElement(By.id("you_track_setting_login")).sendKeys("yana.gusti@thinkmobiles.com");
        driver.findElement(By.id("you_track_setting_base_url")).clear();
        driver.findElement(By.id("you_track_setting_base_url")).sendKeys("http://45.32.154.169:8080/");
        driver.findElement(By.id("you_track_setting_service_pid")).clear();
        driver.findElement(By.id("you_track_setting_service_pid")).sendKeys("EQA");
        driver.findElement(By.name("commit")).click();

    }
}
