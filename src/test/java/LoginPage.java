import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;

public class LoginPage {

    @AndroidFindBy(accessibility = "email")
    private WebElement emailField;

    @AndroidFindBy(accessibility = "password")
    private WebElement passwordField;

    @AndroidFindBy(accessibility = "login-button")
    private WebElement loginButton;

    public LoginPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    public void preencherEmail(String email) {
        emailField.sendKeys(email);
    }

    public void preencherSenha(String senha) {
        passwordField.sendKeys(senha);
    }

    public void clicarLogin() {
        loginButton.click();
    }
}
