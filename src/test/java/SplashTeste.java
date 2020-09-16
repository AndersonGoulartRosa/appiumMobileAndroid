import core.appium.BaseTest;
import static org.junit.Assert.*;
import org.junit.Test;
import page.MenuPage;
import page.SplashPage;

public class SplashTeste extends BaseTest {

    private final MenuPage menu = new MenuPage();
    private final SplashPage page = new SplashPage();

    @Test
    public void aguardarSplash(){
        menu.acessarSplash();
        page.isTelaSplashvisivel();
        page.aguardaSplash();
        assertTrue(page.existeElementoTexto("Formulário"));
    }
}
