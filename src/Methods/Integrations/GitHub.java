package Methods.Integrations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sasha on 22.02.2017.
 */
public class GitHub {

    public void addHub(WebDriver driver){
        driver.findElement(By.linkText("Please choose integration plugin")).click();
        driver.findElement(By.linkText("Git Hub")).click();
        driver.findElement(By.id("git_hub_setting_repository_url")).clear();
        driver.findElement(By.id("git_hub_setting_repository_url")).sendKeys("https://github.com/EvtSasha/SuperTest");
        driver.findElement(By.id("git_hub_setting_access_token")).clear();
        driver.findElement(By.id("git_hub_setting_access_token")).sendKeys("44bc19a08fa51c8ecd142f801de3f824ede002fc");
        driver.findElement(By.name("commit")).click();
    }
}
