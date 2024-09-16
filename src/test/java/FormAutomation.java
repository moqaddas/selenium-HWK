import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://syntaxprojects.com/locator-homework.php");
        WebElement fullName = driver.findElement(By.id("fullName"));
        fullName.sendKeys("John Doe");
        WebElement email = driver.findElement(By.name("yourEmail"));
        email.sendKeys("johndoe@gmail.com");
        WebElement clientName = driver.findElement(By.id("clientNameId"));
        clientName.sendKeys("Ali");
        WebElement clientId = driver.findElement(By.id("ClientId"));
        clientId.sendKeys("123456789");
        WebElement clientFeedBack = driver.findElement(By.id("ClientfeedbackId"));
        clientFeedBack.sendKeys("The feature works seamlessly, I was able to complete the task without any issues, excellent work on the development!");
        WebElement projectName = driver.findElement(By.id("ProjectNameId"));
        projectName.sendKeys("Syntax Projects");
        WebElement projectDeadLine = driver.findElement(By.name("ProjectTime"));
        projectDeadLine.sendKeys("24/12/2024");
        WebElement currentAddress = driver.findElement(By.id("CurrentAddressId"));
        currentAddress.sendKeys("556 Main Street, New York, NY 10001");
        WebElement permanentAddress = driver.findElement(By.name("PermanentAddress"));
        permanentAddress.sendKeys(" 123 Main Street, New York, NY 10001");
        WebElement click = driver.findElement(By.linkText("Click Here."));
        click.click();
        WebElement submit = driver.findElement(By.id("btn-submit"));
        submit.click();
        Thread.sleep(5000);
        driver.quit();
    }
}
