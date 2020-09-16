package page;

import core.appium.BasePage;
import core.appium.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SplashPage extends BasePage {

    public boolean isTelaSplashvisivel(){
        return existeElementoTexto("Splash!");
    }

    public void aguardaSplash(){
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']")));
    }
}
