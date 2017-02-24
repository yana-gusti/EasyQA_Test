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
         driver.findElement(By.id("git_lab_setting_access_token")).clear();
         driver.findElement(By.id("git_lab_setting_access_token")).sendKeys("YqKDPtTHieadFPptVMBb");
         driver.findElement(By.id("git_lab_setting_project_url")).clear();
         driver.findElement(By.id("git_lab_setting_project_url")).sendKeys("https://gitlab.com/sasha.yevtushenko/Test.git");
         driver.findElement(By.name("commit")).click();
     }
}
