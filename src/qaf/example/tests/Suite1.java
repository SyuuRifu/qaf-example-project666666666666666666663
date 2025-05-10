package qaf.example.tests;

import org.testng.annotations.Test;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import static com.qmetry.qaf.automation.step.CommonStep.*;

public class Suite1 extends WebDriverTestCase {

    @Test(description="Sample Test Scenario", groups={"SMOKE"})
    public void testGoogleSearch() {
        get("/");
        sendKeys("Git reporsitory QAF", "txt.searchbox");
        submit("txt.searchbox");
        verifyLinkWithPartialTextPresent("qaf");
        System.out.println("test@@@@@@@@@@@@!!!");
    }



}