package Methods.Integrations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sasha on 22.02.2017.
 */
public class Jira {

    public static void addJira(WebDriver driver) {
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.xpath("//div[@id='myModal']/div/div/div/div/div/ul/li[5]/a/label")).click();
        driver.findElement(By.id("jira_setting_base_url")).clear();
        driver.findElement(By.id("jira_setting_base_url")).sendKeys("https://test-thinkmobiles.atlassian.net");
        driver.findElement(By.id("jira_setting_username")).clear();
        driver.findElement(By.id("jira_setting_username")).sendKeys("admin");
        driver.findElement(By.id("jira_setting_password")).clear();
        driver.findElement(By.id("jira_setting_password")).sendKeys("000000");
        driver.findElement(By.id("jira_setting_password")).clear();
        driver.findElement(By.id("jira_setting_password")).sendKeys("00000000");
        driver.findElement(By.id("jira_setting_project_key")).clear();
        driver.findElement(By.id("jira_setting_project_key")).sendKeys("TEST");
        driver.findElement(By.id("jira_setting_board_name")).clear();
        driver.findElement(By.id("jira_setting_board_name")).sendKeys("TEST board");
        driver.findElement(By.name("commit")).click();
    }
}
