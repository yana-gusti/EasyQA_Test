package Methods.Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


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


    public void createwithoutorgan(WebDriver driver) {
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/header/div[2]/a[2]")).click();
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.id("project_title")).click();
        driver.findElement(By.id("project_title")).clear();
        driver.findElement(By.id("project_title")).sendKeys("sssome");
        driver.findElement(By.name("commit")).click();
    }

    public void MaxSymbolsproject(WebDriver driver) {
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/header/div[2]/a[2]")).click();
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.id("project_title")).click();
        driver.findElement(By.id("project_title")).clear();
        driver.findElement(By.id("project_title")).sendKeys("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
        driver.findElement(By.name("commit")).click();
    }
    public void Upload(WebDriver driver){
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/header/div[2]/a[2]")).click();
        driver.findElement(By.cssSelector("label.dd-selected-text")).click();
        driver.findElement(By.linkText("IDE")).click();
        driver.findElement(By.id("project_title")).click();
        driver.findElement(By.id("project_title")).clear();
        driver.findElement(By.id("project_title")).sendKeys("somewithimage");
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div/div[2]/div/div[1]/span[1]")).click();
        driver.findElement(By.name("commit"));
    }
    public void changeDescription(WebDriver driver){
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/header/ul/li[2]/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div/div[2]/div[2]/div[1]/div/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/div/div/div[1]/nav/ul/li[7]/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/a")).click();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div[3]/input")).sendKeys("newnames");
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div[3]/input")).clear();
        driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[2]/form/input[3]")).click();
        driver.findElement(By.name("commit"));
    }
}




