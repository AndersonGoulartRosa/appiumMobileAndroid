package page;

import core.appium.BasePage;

public class MenuPage extends BasePage {


    public void acessarFormulario(){
        clicarPorTexto("Formulário");
    }
    public void acessarSplash(){
        clicarPorTexto("Splash");
    }

    public void acessarAlerta(){
        clicarPorTexto("Alertas");
    }

    public void acessarAbas(){
        clicarPorTexto("Abas");
    }

    public void acessarAccordion(){
        clicarPorTexto("Accordion");
    }
}
