import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Drukarnia1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","Drivers/Edge/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.drukarnia1.pl");
    }
}
