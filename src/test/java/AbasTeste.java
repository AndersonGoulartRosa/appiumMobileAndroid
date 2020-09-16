import core.appium.BaseTest;
import static org.junit.Assert.*;
import org.junit.Test;
import page.AbasPage;
import page.MenuPage;

public class AbasTeste extends BaseTest {
    private final MenuPage menu = new MenuPage();
    private final AbasPage page = new AbasPage();

    @Test
    public void interagirComAbas(){
        menu.acessarAbas();
        assertTrue(page.isPrimeiraAba());
        page.acessarSegundaAba();
        assertTrue(page.isSegundaAba());
    }
}
