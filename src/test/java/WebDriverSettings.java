import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class WebDriverSettings {

    public static WebDriver driver;
    public static Faker faker;
    public static MainPage mainPage;
    public static VehiclePage vehiclePage;
    public static CarByZIPPage carByZIPPage;
    public static SelectedCarPage selectedCarPage;
    public static CheckoutPage checkoutPage;


    @BeforeClass
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

        @BeforeMethod
        public void start(){
        driver.get("https://dev-app.drivego.com/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("GO Car Subscription | Order Online - Save up to 25% per month."));

        faker = new Faker();
        mainPage = new MainPage(driver);
        vehiclePage = new VehiclePage(driver);
        carByZIPPage = new CarByZIPPage(driver);
        selectedCarPage = new SelectedCarPage(driver);
        checkoutPage = new CheckoutPage(driver);


    }

//    @AfterMethod
//    public void close() {
//        driver.quit();
//    }

}
