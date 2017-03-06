package Methods.Integrations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sasha on 23.02.2017.
 */
public class RedMine {
    public  void addredmine(WebDriver driver){
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.linkText("Redmine")).click();
        driver.findElement(By.id("redmine_setting_base_url")).click();
        driver.findElement(By.id("redmine_setting_base_url")).clear();
        driver.findElement(By.id("redmine_setting_base_url")).sendKeys("http://thinktest.m.redmine.org/");
        driver.findElement(By.id("redmine_setting_api_key")).click();
        driver.findElement(By.id("redmine_setting_api_key")).clear();
        driver.findElement(By.id("redmine_setting_api_key")).sendKeys("4c6c9ba9fdb2284dbd158fd6983ea897bd78e2b9");
        driver.findElement(By.id("redmine_setting_project_name")).click();
        driver.findElement(By.id("redmine_setting_project_name")).clear();
        driver.findElement(By.id("redmine_setting_project_name")).sendKeys("Test");
        driver.findElement(By.id("redmine_setting_tracker_name")).click();
        driver.findElement(By.id("redmine_setting_tracker_name")).clear();
        driver.findElement(By.id("redmine_setting_tracker_name")).sendKeys("Tracker");
        driver.findElement(By.name("commit")).click();
    }
    public  void failRedMine(WebDriver driver){
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.linkText("Redmine")).click();
        driver.findElement(By.id("redmine_setting_base_url")).click();
        driver.findElement(By.id("redmine_setting_base_url")).clear();
        driver.findElement(By.id("redmine_setting_base_url")).sendKeys("http://thinktest.m.redmine.org/");
        driver.findElement(By.id("redmine_setting_api_key")).click();
        driver.findElement(By.id("redmine_setting_api_key")).clear();
        driver.findElement(By.id("redmine_setting_api_key")).sendKeys("4c6c9ba9fdb2284dbd158fd6983ea897bd78e2b91");
        driver.findElement(By.id("redmine_setting_project_name")).click();
        driver.findElement(By.id("redmine_setting_project_name")).clear();
        driver.findElement(By.id("redmine_setting_project_name")).sendKeys("Test");
        driver.findElement(By.id("redmine_setting_tracker_name")).click();
        driver.findElement(By.id("redmine_setting_tracker_name")).clear();
        driver.findElement(By.id("redmine_setting_tracker_name")).sendKeys("Tracker");
        driver.findElement(By.name("commit")).click();
    }

}
