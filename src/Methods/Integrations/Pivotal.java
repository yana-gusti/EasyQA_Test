package Methods.Integrations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sasha on 22.02.2017.
 */
public class Pivotal {

    public  void addPivotal (WebDriver driver){
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.linkText("Pivotal")).click();
        driver.findElement(By.id("pivotal_setting_project_name")).clear();
        driver.findElement(By.id("pivotal_setting_project_name")).sendKeys("EasyQA");
        driver.findElement(By.id("pivotal_setting_api_token")).clear();
        driver.findElement(By.id("pivotal_setting_api_token")).sendKeys("e78ebf4af1ba261df84a2863774ae1ef");
        driver.findElement(By.name("commit")).click();

    }
    public  void failPivotal (WebDriver driver){
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.linkText("Pivotal")).click();
        driver.findElement(By.id("pivotal_setting_project_name")).clear();
        driver.findElement(By.id("pivotal_setting_project_name")).sendKeys("EasyQA");
        driver.findElement(By.id("pivotal_setting_api_token")).clear();
        driver.findElement(By.id("pivotal_setting_api_token")).sendKeys("e78ebf4af1ba261df84a2863774ae1ef1");
        driver.findElement(By.name("commit")).click();
    }

}
