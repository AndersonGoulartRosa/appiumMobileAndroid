package page;

import core.appium.BasePage;
import org.openqa.selenium.By;

public class AlertaPage extends BasePage {

    private Object tap;

    public void clicarAlertaConfirm(){
        clicarPorTexto("ALERTA CONFIRM");
    }

    public void clicarAlertaSimples(){
        clicarPorTexto("ALERTA SIMPLES");
    }

    public String obterTitulo(){
        return obterTexto(By.id("android:id/alertTitle"));
    }

    public String obterMensagem(){
        return obterTexto(By.id("android:id/message"));
    }

    public void confirmar(){
        clicarPorTexto("CONFIRMAR");
    }

    public void sair(){
        clicarPorTexto("SAIR");
    }


}
