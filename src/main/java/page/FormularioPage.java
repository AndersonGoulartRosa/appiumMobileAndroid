package page;

import core.appium.BasePage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class FormularioPage extends BasePage {

    public void escreverNome(){
        escrever(MobileBy.AccessibilityId("nome"),"anderson");
    }

    public String obterNome(){
        return obterTexto(MobileBy.AccessibilityId("nome"));
    }

    public void selecionarCombo(String valor){
        selecionarCombo(MobileBy.AccessibilityId("console"),valor);
    }

    public String obterValorCombo(){
        return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
    }

    public void clicarCheck(){
        clicar(By.className("android.widget.CheckBox"));
    }

    public void clicarSwitch(){
        clicar(MobileBy.AccessibilityId("switch"));
    }

    public boolean isCheckMarcado(){
       return isCheckMarcado(By.className("android.widget.CheckBox"));
    }

    public boolean isSwitchMarcado(){
        return isCheckMarcado(MobileBy.AccessibilityId("switch"));
    }

    public void clicarSalvar(){
        clicarPorTexto("SALVAR DEMORADO");
    }

    public void clicarSalvarDemorado(){
        clicarPorTexto("SALVAR");

    }

    public String obterNomeCadastrado(){
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Nome:')]"));
    }

    public String obterConsoleCadastrado(){
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Console:')]"));
    }

    public String obterSwitchCadastrado(){
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Switch:')]"));
    }

    public String obterCheckCadastrado(){
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Checkbox:')]"));
    }
}
