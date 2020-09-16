package core.appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;

import java.time.Duration;
import java.util.List;
import static core.appium.DriverFactory.getDriver;

public class BasePage {

    public void escrever(By by, String texto){
        getDriver().findElement(by).sendKeys(texto);
    }

    public String obterTexto(By by){
        return getDriver().findElement(by).getText();
    }

    public void clicar(By by){
        getDriver().findElement(by).click();
    }

    public void clicarPorTexto(String texto){
        clicar(By.xpath("//*[@text='"+texto+"']"));
    }

    public void selecionarCombo(By by, String valor){
        getDriver().findElement(by).click();
        clicarPorTexto(valor);
    }
    public boolean isCheckMarcado(By by){
        return getDriver().findElement(by).getAttribute("checked").equals("true");
    }

    public boolean existeElementoTexto(String texto){
      List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='"+texto+"']"));
      return elementos.size()>0;
    }

    public void tap() {
        new TouchAction(getDriver()).tap(PointOption.point(700,900)).release().perform();
        System.out.println("executou o tap");


    }
}
