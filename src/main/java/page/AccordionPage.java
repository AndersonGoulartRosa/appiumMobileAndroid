package page;

import core.appium.BasePage;

public class AccordionPage extends BasePage {

    public void clicarPrimeiraOpcao(){
        clicarPorTexto("Opção 1");
    }

    public boolean isPrimeiraOpcao(){
        return existeElementoTexto("Esta é a descrição da opção 1");
    }

}
