package Methods.Integrations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sasha on 22.02.2017.
 */
public class Jira {

    public  void addJira(WebDriver driver) {
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.linkText("Jira")).click();
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

    public void failJira(WebDriver driver) {
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.linkText("Jira")).click();
        driver.findElement(By.id("jira_setting_base_url")).click();
        driver.findElement(By.id("jira_setting_base_url")).clear();
        driver.findElement(By.id("jira_setting_base_url")).sendKeys("https://test-thinkmobiles.atlassian.net");
        driver.findElement(By.id("jira_setting_username")).click();
        driver.findElement(By.id("jira_setting_username")).clear();
        driver.findElement(By.id("jira_setting_username")).sendKeys("admin");
        driver.findElement(By.id("jira_setting_password")).click();
        driver.findElement(By.id("jira_setting_password")).clear();
        driver.findElement(By.id("jira_setting_password")).sendKeys("000000");
        driver.findElement(By.id("jira_setting_project_key")).click();
        driver.findElement(By.id("jira_setting_project_key")).clear();
        driver.findElement(By.id("jira_setting_project_key")).sendKeys("TEST");
        driver.findElement(By.id("jira_setting_board_name")).click();
        driver.findElement(By.id("jira_setting_board_name")).clear();
        driver.findElement(By.id("jira_setting_board_name")).sendKeys("TEST board1");
        driver.findElement(By.name("commit")).click();

    }


}
