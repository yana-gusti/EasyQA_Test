package Methods.Integrations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sasha on 23.02.2017.
 */
public class GitLub {
     public void addlub (WebDriver driver){
         driver.findElement(By.cssSelector("label.dd-selected-text")).click();
         driver.findElement(By.linkText("Git Lab")).click();
         driver.findElement(By.id("git_lab_setting_project_url")).click();
         driver.findElement(By.id("git_lab_setting_project_url")).clear();
         driver.findElement(By.id("git_lab_setting_project_url")).sendKeys("https://gitlab.com/Hoshylyk/Testing");
         driver.findElement(By.id("git_lab_setting_access_token")).click();
         driver.findElement(By.id("git_lab_setting_access_token")).clear();
         driver.findElement(By.id("git_lab_setting_access_token")).sendKeys("NcG_X6DFTFTZtwhV6t9E");
         driver.findElement(By.name("commit")).click();
     }

    public void failaddlub (WebDriver driver){
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.linkText("Git Lab")).click();
        driver.findElement(By.id("git_lab_setting_project_url")).click();
        driver.findElement(By.id("git_lab_setting_project_url")).clear();
        driver.findElement(By.id("git_lab_setting_project_url")).sendKeys("https://gitlab.com/Hoshylyk/Testing");
        driver.findElement(By.id("git_lab_setting_access_token")).click();
        driver.findElement(By.id("git_lab_setting_access_token")).clear();
        driver.findElement(By.id("git_lab_setting_access_token")).sendKeys("NcG_X6DFTFTZtwhV6t9Esdf");
        driver.findElement(By.name("commit")).click();

    }


}
