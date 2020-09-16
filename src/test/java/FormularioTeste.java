import core.appium.BaseTest;
import static org.junit.Assert.*;
import core.appium.DriverFactory;
import io.appium.java_client.MobileBy;
import org.junit.Before;
import org.junit.Test;
import page.FormularioPage;
import page.MenuPage;
import java.util.concurrent.TimeUnit;

public class FormularioTeste  extends BaseTest {

    private final MenuPage menu = new MenuPage();
    private final FormularioPage page = new FormularioPage();

   @Before
    public void iniciarlizarAppium() {
        menu.acessarFormulario();

    }
@Test
    public void escreverNome(){
        page.escreverNome();
        assertEquals("anderson", page.obterNome());
    }

    @Test
    public void devePreencherCampoText() {
        page.escreverNome();
        assertEquals("anderson", page.obterNome());

    }
    @Test
    public void clicarNoCampo(){
       page.selecionarCombo("Nintendo Switch");
        assertEquals("Nintendo Switch",page.obterValorCombo());
    }
@Test
    public void interagirCheckboxSwitch(){

        assertFalse(page.isCheckMarcado());
        assertTrue(page.isSwitchMarcado());

        page.clicarCheck();
        page.clicarSwitch();

        assertTrue(page.isCheckMarcado());
        assertFalse(page.isSwitchMarcado());

    }

@Test
    public void realizaCadastro(){

        page.escreverNome();
        page.clicarCheck();
        page.clicarSwitch();
        page.selecionarCombo("Nintendo Switch");
        page.clicarSalvar();
        assertEquals("Nome: anderson",page.obterNomeCadastrado());
        assertEquals("Console: switch",page.obterConsoleCadastrado());
        assertTrue(page.obterSwitchCadastrado().endsWith("Off"));
        assertTrue(page.obterCheckCadastrado().endsWith("Marcado"));
    }


    public void realizaCadastroDemorado(){
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        page.escreverNome();
        page.clicarSalvarDemorado();
        assertEquals("Nome: anderson",page.obterNomeCadastrado());
    }

@Test
    public void alterarData(){
        page.clicarPorTexto("01/01/2000");
        page.clicarPorTexto("20");
        page.clicarPorTexto("OK");
        assertTrue(page.existeElementoTexto("20/2/2000"));
    }

    @Test
    public void alterarHorario(){
       page.clicarPorTexto("06:00");
       page.clicar(MobileBy.AccessibilityId("10"));
       page.clicar(MobileBy.AccessibilityId("40"));
       page.clicarPorTexto("OK");
        assertTrue(page.existeElementoTexto("10:40"));

    }
}
