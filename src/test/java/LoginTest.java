import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.*;
import java.net.MalformedURLException;
import java.net.URL;

public class LoginTest {

    private AndroidDriver driver;
    private LoginPage loginPage;

    @BeforeEach
    public void setUp() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("emulator-5554")
                .setPlatformName("Android")
                .setApp("C:\\Users\\rafae.RAF4ELBONFATTI\\Downloads\\projetoBase\\apps\\qafood.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLoginComSucesso() {
        loginPage.preencherEmail("teste@teste.com");
        loginPage.preencherSenha("123456");
        loginPage.clicarLogin();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
