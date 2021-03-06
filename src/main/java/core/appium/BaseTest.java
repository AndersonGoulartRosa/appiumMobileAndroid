package core.appium;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    @Rule
    public TestName testName = new TestName();

    @AfterClass
    public static void fianlizaClasse(){
         DriverFactory.killDriver();
    }

    @After
    public void exitAppium() {
        capturarScreenShot(testName.getMethodName());
        DriverFactory.getDriver().resetApp();
    }

    public void capturarScreenShot(String name) {
        try {
            File imagem = ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile((File) imagem, new File("target/screenshots/"+testName+".png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
