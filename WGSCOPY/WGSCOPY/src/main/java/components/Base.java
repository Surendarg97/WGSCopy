package components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;



public class Base {

    static private WebDriver driver;
    static public WebDriverWait wait;
    public static String browser;
    public static String url;
    public static Configuration configuration=ConfigClass.configuration;




    @BeforeTest
    public void initDriver(){
        browser=configuration.browser();
        url=configuration.url();
        System.setProperty("webdriver.chrome.driver","E:\\LocalGitHubRepository\\IntelliJIDEAProjects\\WGSCOPY\\WGSCOPY\\src\\main\\resources\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        setDriver(driver);
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait=new WebDriverWait(getDriver(),10);
        ReportManager.extentAttachReport();
    }

    /*@BeforeTest
    public void zcreateExtentTest(ITestContext context){
        System.out.println("before class reportmanager");
        ReportManager.extentTest=ReportManager.extent.createTest(context.getName());
    }*/
    public static void setDriver(WebDriver driver){
        Base.driver=driver;
    }

    public static WebDriver getDriver(){
        return driver;
    }

    @BeforeMethod
    public static void createExtentTestNode(Method method){
       ReportManager.extentTest=ReportManager.extent.createTest(method.getName().toUpperCase());
       ReportManager.createExtentTestNode(method.getName()).assignAuthor("Surendar").assignDevice("Personal").assignCategory("Learning");
    }

    @AfterMethod
    public static void flushingExtentReport(){
       ReportManager.extent.flush();
    }

    @AfterSuite
    public void quitDriver(){
       /* getDriver().quit();*/
    }

    }
