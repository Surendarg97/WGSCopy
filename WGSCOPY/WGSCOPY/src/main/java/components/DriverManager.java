package components;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager extends Base{

    public static void initateDriver(String browserName){

        if(browserName.equalsIgnoreCase("chrome"))
        WebDriverManager.chromedriver().setup();

    }
}
