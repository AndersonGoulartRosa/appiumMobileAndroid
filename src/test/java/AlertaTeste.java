import core.appium.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import page.AlertaPage;
import page.MenuPage;


public class AlertaTeste extends BaseTest {

    private final MenuPage menu = new MenuPage();
    private final AlertaPage page = new AlertaPage();

    @Before
    public void acessarAlerta(){
        menu.acessarAlerta();
    }

    @Test
    public void confirmarAlerta(){
        page.clicarAlertaConfirm();
        Assert.assertEquals("Info",page.obterTitulo());
        Assert.assertEquals("Confirma a operação?",page.obterMensagem());
        page.confirmar();
        Assert.assertEquals("Confirmado",page.obterMensagem());
        page.sair();

    }
    @Test
    public void clicarForaAlerta() throws InterruptedException {
        page.clicarAlertaSimples();
        Thread.sleep(2000);
        page.tap();
         Assert.assertFalse(page.existeElementoTexto("Pode clicar no OK ou fora da caixa para sair"));

    }
}
