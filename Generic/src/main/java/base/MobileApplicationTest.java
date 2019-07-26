package base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MobileApplicationTest {
    public static AppiumDriver appiumDriver = null;

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
        capabilities.setCapability(MobileCapabilityType.APP,"/Users/mac/Documents/weekdays/MobileAutomation/Generic/src/main/resources/Target_v6.44.0_apkpure.com.apk");

        //launch the application
        appiumDriver= new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
        appiumDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        /**
        WebElement account = appiumDriver.findElement(By.xpath("//android.widget.Button[@text='get started']"));
        if(account.isDisplayed())
        {
            System.out.println(account.getText()+" is displayed");
            account.click();
        }
         **/
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // System.out.println(appiumDriver.getPageSource());




    }

}
