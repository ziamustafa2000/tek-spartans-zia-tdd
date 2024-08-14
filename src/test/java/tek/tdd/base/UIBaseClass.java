package tek.tdd.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import tek.tdd.utility.SeleniumUtility;

public class UIBaseClass extends SeleniumUtility {
    private static final Logger LOGGER = LogManager.getLogger(UIBaseClass.class);

    @BeforeMethod
    public void setupTests() {
        LOGGER.info("Setup Test and opening browser");
        setupBrowser();
    }

    @AfterMethod
    public void testCleanup() {
        LOGGER.info("running after each test and quite browser");
        quitBrowser();
    }

}