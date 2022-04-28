import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckUrl {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm\n");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        if(title.equals("ParaBank | Welcome | Online Banking")){
            System.out.println("Bank home page is displayed");

        }
        else{
            System.out.println("bank home page is not displayed");
        }
        driver.quit();
    }
}
