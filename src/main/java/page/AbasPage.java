package page;

import core.appium.BasePage;

public class AbasPage extends BasePage {

    public boolean isPrimeiraAba(){
        return existeElementoTexto("Este é o conteúdo da Aba 1");
    }
    public void acessarSegundaAba(){
        clicarPorTexto("ABA 2");
    }
    public boolean isSegundaAba(){
        return existeElementoTexto("Este é o conteúdo da Aba 2");
    }

}
