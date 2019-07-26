import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends MobileAPI {
    TargetHomePage home ;
    @BeforeMethod
    public void init(){
        home = PageFactory.initElements(appiumDriver,TargetHomePage.class);

    }
    @Test
    public void clickStarted(){
        home.setGetStarted();
    }

}
