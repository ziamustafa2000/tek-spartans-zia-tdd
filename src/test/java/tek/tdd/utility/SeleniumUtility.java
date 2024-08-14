package tek.tdd.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.tdd.base.BaseSetup;

import java.time.Duration;

public class SeleniumUtility extends BaseSetup {
    private static final Logger LOGGER = LogManager.getLogger(SeleniumUtility.class);
    private WebDriverWait getWait()  {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(WAIT_TIME_IN_SECOND));
    }

    public String getElementText(By locator) {
        LOGGER.debug("Returning element Text {}" , locator);
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator))
                .getText();
    }

}