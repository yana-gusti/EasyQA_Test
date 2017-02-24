package Methods.Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

import static org.testng.Assert.assertTrue;


public class Project {
    public void project(WebDriver driver) {
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/header/div[2]/a[2]")).click();
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.linkText("IDE")).click();
        driver.findElement(By.id("project_title")).click();
        driver.findElement(By.id("project_title")).clear();
        driver.findElement(By.id("project_title")).sendKeys("some");
        driver.findElement(By.name("commit")).click();
    }
    public void withoutOrgan(WebDriver driver) {
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/header/div[2]/a[2]")).click();
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.id("project_title")).click();
        driver.findElement(By.id("project_title")).clear();
        driver.findElement(By.id("project_title")).sendKeys("sssome");
        driver.findElement(By.name("commit")).click();
        WebElement errorMessage = driver.findElement(By.className("message"));
        assertTrue(errorMessage.getText().contains("can't be blank"));
    }
    public void MaxSymbols(WebDriver driver) {
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/header/div[2]/a[2]")).click();
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.id("project_title")).click();
        driver.findElement(By.id("project_title")).clear();
        driver.findElement(By.id("project_title")).sendKeys("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        driver.findElement(By.name("commit")).click();
        WebElement errorMessage = driver.findElement(By.className("message"));
        assertTrue(errorMessage.getText().contains("is too long (maximum is 150 characters)"));
    }
    public void Upload(WebDriver driver) {
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/header/div[2]/a[2]")).click();
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.linkText("IDE")).click();
        driver.findElement(By.id("project_title")).click();
        driver.findElement(By.id("project_title")).clear();
        driver.findElement(By.id("project_title")).sendKeys("somewithimage");
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div/div[2]/div/div[1]"));
    }
    public void UploadAndDelete(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/header/div[2]/a[2]")).click();
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.linkText("IDE")).click();
        driver.findElement(By.id("project_title")).click();
        driver.findElement(By.id("project_title")).clear();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div/div[2]/div/div[1]"));
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div/div[2]/div/div[3]/a[2]"));
    }
    public void changeDescription(WebDriver driver) {
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/header/ul/li[2]/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[2]/div[1]/div/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/div/div/div[1]/nav/ul/li[7]/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div[3]/input")).clear();
        driver.findElement(By.id("project_title")).sendKeys("newname");
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/input[3]")).click();
        driver.findElement(By.name("commit"));
    }
    public void AddPlatform(WebDriver driver) throws InterruptedException {
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/header/ul/li[2]/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[2]/div[1]/div/a")).click();
        driver.findElement(By.linkText("Settings")).click();
        driver.findElement(By.linkText("Change")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div[2]/div/label[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div[2]/div/label[2]")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div[2]/div/label[3]")).click();
    }
    public void addMembers(WebDriver driver){
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/header/ul/li[2]/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[2]/div[1]/div/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/div/div/div/table/tbody/tr[2]/td[6]/label")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[3]/span[1]")).click();
    }
    public void changeProjectRole(WebDriver driver, Integer i) throws InterruptedException {
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/header/ul/li[2]/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[2]/div[1]/div/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div[2]/div/div/div/div/div[1]/div[2]/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/div/div/div/table/tbody/tr[2]/td[5]/div/div/div/span")).click();

        ArrayList<WebElement> listOfProjctRoles = (ArrayList<WebElement>)
                driver.findElements(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/div/div[1]/div/div/div/div/table/tbody/tr[2]/td[5]/div/div/ul/li"));
        WebElement role = listOfProjctRoles.get(i).findElement(By.xpath("./a"));
        role.click();
        driver.findElement(By.id("send")).click();
    }
    public void changeViewer(WebDriver driver) throws InterruptedException {
        changeProjectRole(driver, 2);
    }
    public void changeDeveloper(WebDriver driver) throws InterruptedException {
        changeProjectRole(driver, 0);
    }
    public void changeTester(WebDriver driver) throws InterruptedException {
        changeProjectRole(driver, 1);
    }
    public void changeManager(WebDriver driver) throws InterruptedException {
        changeProjectRole(driver, 3);
    }
    public void deleteProject(WebDriver driver){
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/header/ul/li[2]/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[2]/div[1]/div/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/div/div/div[1]/nav/ul/li[7]/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/div/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/div/a")).click();
    }
}



