package Methods.TestPlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 16-Feb-17.
 */
public class TestPlan {

    public WebElement projectsButton;
    public WebElement project;
    public WebElement testingActivities;
    public WebElement testplanButton;
    public WebElement newtestplanButton;
    public WebElement titlefield;
    public WebElement savetestplanButton;


    public void addTestplan (WebDriver driver, String _title) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        projectsButton = driver.findElement(By.xpath(".//*[@id='head_menu']/ul/li[2]/a"));
        projectsButton.click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        project = driver.findElement(By.cssSelector(".project-name"));
        project.click();
        testingActivities = driver.findElement(By.id("SvgjsSvg1044"));
        testingActivities.click();
        testplanButton = driver.findElement(By.linkText("Test plans"));
        testplanButton.click();
        newtestplanButton = driver.findElement(By.xpath(".//*[@id='test_plans']/div/div[1]/div[1]/a"));
        newtestplanButton.click();
        Thread.sleep(2000);
        titlefield = driver.findElement(By.xpath(".//*[@id='test_plan_title']"));
        titlefield.sendKeys(_title);
        savetestplanButton = driver.findElement(By.xpath(".//*[@id='new_test_plan']/div[3]/input"));
        savetestplanButton.click();
    }
}
