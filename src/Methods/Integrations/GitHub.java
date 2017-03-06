package Methods.Integrations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sasha on 22.02.2017.
 */
public class GitHub {

    public void addHub(WebDriver driver){
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.linkText("Git Hub")).click();
        driver.findElement(By.id("git_hub_setting_repository_url")).click();
        driver.findElement(By.id("git_hub_setting_repository_url")).clear();
        driver.findElement(By.id("git_hub_setting_repository_url")).sendKeys("https://github.com/test-thinkmobile/testing");
        driver.findElement(By.id("git_hub_setting_access_token")).click();
        driver.findElement(By.id("git_hub_setting_access_token")).click();
        driver.findElement(By.id("git_hub_setting_access_token")).clear();
        driver.findElement(By.id("git_hub_setting_access_token")).sendKeys("ee8dbce1f5961e630d9776863f7e35f08851c312");
        driver.findElement(By.name("commit")).click();
    }



    public void failHub (WebDriver driver){
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.linkText("Git Hub")).click();
        driver.findElement(By.id("git_hub_setting_repository_url")).click();
        driver.findElement(By.id("git_hub_setting_repository_url")).clear();
        driver.findElement(By.id("git_hub_setting_repository_url")).sendKeys("https://github.com/test-thinkmobile/testing");
        driver.findElement(By.id("git_hub_setting_access_token")).click();
        driver.findElement(By.id("git_hub_setting_access_token")).click();
        driver.findElement(By.id("git_hub_setting_access_token")).clear();
        driver.findElement(By.id("git_hub_setting_access_token")).sendKeys("ee8dbce1f5961e630d9776863f7e35f08851c312234");
        driver.findElement(By.name("commit")).click();
    }
}
