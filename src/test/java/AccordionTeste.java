import core.appium.BaseTest;
import static org.junit.Assert.*;
import org.junit.Test;
import page.AccordionPage;
import page.MenuPage;

public class AccordionTeste extends BaseTest {
    private final static MenuPage menu = new MenuPage();
    private final static AccordionPage page = new AccordionPage();

    @Test
    public void validarAccordion()  {
        menu.acessarAccordion();
        page.clicarPrimeiraOpcao();
        assertTrue(page.isPrimeiraOpcao());
    }
}
