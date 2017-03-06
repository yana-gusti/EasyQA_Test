package Methods.Integrations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sasha on 21.02.2017.
 */
public class Integration {

    public  void addIntegration(WebDriver driver){
        driver.findElement(By.linkText("My Projects")).click();
        driver.findElement(By.cssSelector("img.project-logo.mCS_img_loaded")).click();
        driver.findElement(By.linkText("Integrations")).click();
        driver.findElement(By.linkText("Plugin Integrations")).click();
        driver.findElement(By.linkText("Add new plugin")).click();
    }
}


