import base.MobileAPI;
import cucumber.api.java.en.And;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TargetHomePage extends MobileAPI {
    @FindBy(xpath = "//android.widget.Button[@text='get started']")
    WebElement getStarted;
    @FindBy(xpath = "//android.widget.Button[@text='Sign in with Target account']")
    WebElement signin;
    @FindBy(xpath = "//android.widget.Button[@text='Create account']")
    WebElement createAccount;
    @FindBy(xpath = "//android.widget.Button[@text='CONTINUE AS GUEST']")
    WebElement guest;

    public void setGetStarted(){

       getStarted.click();
    }
    public void setSignin(){
        signin.click();
    }
    public void setCreateAccount(){
        createAccount.click();
    }
    public void setGuest(){
        guest.click();
    }






}
