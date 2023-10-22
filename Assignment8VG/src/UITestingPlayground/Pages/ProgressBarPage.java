package Pages;

import PageBase.PageBase;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ProgressBarPage extends PageBase {
    Page page;
    public Locator progressBar;
    public Locator startButton;
    public Locator stoppButton;
    public String progressBarValue;
    public float progressValue;
    public Locator result;

    public ProgressBarPage(Page page) {
        this.page = page;
        this.progressBar = page.locator("#progressBar");
        this.startButton = page.locator("#startButton");
        this.stoppButton = page.locator("#stopButton");
        this.progressBarValue = progressBar.getAttribute("aria-valuenow");
        this.progressValue = Float.parseFloat(progressBarValue);
        this.result = page.locator("#result");
    }


    public void progressBarMethod() {
        startButton.dblclick();
        page.waitForTimeout(7000);
            stoppButton.click();
        /* Försökte med denna men fick inte till det....

        if (progressValue > 75.0) {
            stoppButton.click();
        } else {
            startButton.click();
        }
        */

    }
}
