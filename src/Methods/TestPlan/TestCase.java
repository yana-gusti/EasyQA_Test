package Methods.TestPlan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * Created by Admin on 17-Feb-17.
 */
public class TestCase {
    public WebElement projectsButton;
    public WebElement project;
    public WebElement testingActivities;
    public WebElement testplanButton;
    public WebElement newtestplanButton;
    public WebElement titlefield;
    public WebElement savetestplanButton;
    public WebElement addModuleButton;
    public WebElement titlefieldModule;
    public WebElement savemoduleButton;
    public WebElement addCaseButton;
    public WebElement titlefieldCase;
    public WebElement dropdownCase;
    public WebElement savecaseButton;



    public void addTestCase (WebDriver driver, String _titleP, String _titleM, String _titleC) throws InterruptedException {
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
        titlefield.sendKeys(_titleP);
        savetestplanButton = driver.findElement(By.xpath(".//*[@id='new_test_plan']/div[3]/input"));
        savetestplanButton.click();
        Thread.sleep(2000);
        addModuleButton = driver.findElement(By.linkText("Add module"));
        addModuleButton.click();
        titlefieldModule = driver.findElement(By.id("test_module_title"));
        titlefieldModule.sendKeys(_titleM);
        savemoduleButton = driver.findElement(By.name("commit"));
        savemoduleButton.click();
        Thread.sleep(2000);
        addCaseButton = driver.findElement(By.linkText("Add case"));
        addCaseButton.click();
        titlefieldCase = driver.findElement(By.id("test_case_title"));
        titlefieldCase.sendKeys(_titleC);
        dropdownCase = driver.findElement(By.xpath(".//*[@id='section']/div/span"));
        dropdownCase.click();
        dropdownCase = driver.findElement(By.xpath(".//*[@id='section']/ul/li[2]/a/label"));
        dropdownCase.click();
        Thread.sleep(2000);
        savecaseButton = driver.findElement(By.xpath(".//*[@id='new_test_case']/div[2]/input"));
        savecaseButton.click();


    }

    public void addTestCaseEmpty (WebDriver driver, String _titleP, String _titleM, String _titleC) throws InterruptedException {
        //метод для теста newTestcaseEmpty
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
        titlefield.sendKeys(_titleP);
        savetestplanButton = driver.findElement(By.xpath(".//*[@id='new_test_plan']/div[3]/input"));
        savetestplanButton.click();
        Thread.sleep(2000);
        addModuleButton = driver.findElement(By.linkText("Add module"));
        addModuleButton.click();
        titlefieldModule = driver.findElement(By.id("test_module_title"));
        titlefieldModule.sendKeys(_titleM);
        savemoduleButton = driver.findElement(By.name("commit"));
        savemoduleButton.click();
        Thread.sleep(2000);
        addCaseButton = driver.findElement(By.linkText("Add case"));
        addCaseButton.click();
        titlefieldCase = driver.findElement(By.id("test_case_title"));
        titlefieldCase.sendKeys(_titleC);
        savecaseButton = driver.findElement(By.xpath(".//*[@id='new_test_case']/div[2]/input"));
        savecaseButton.click();
    }



}
