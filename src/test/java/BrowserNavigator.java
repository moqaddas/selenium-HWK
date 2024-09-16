import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com");
        String title = driver.getTitle();
        System.out.println("The title of the page is: " + title);
        driver.navigate().to("https://www.syntaxprojects.com/");
        String title2 = driver.getTitle();
        System.out.println("The title of the page is: " + title2);
        driver.navigate().back();
        driver.navigate().refresh();
        driver.quit();
    }
}
