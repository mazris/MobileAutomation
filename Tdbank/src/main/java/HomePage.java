import base.MobileAPI;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class HomePage extends MobileAPI {
    @AndroidFindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    WebElement account;

}
