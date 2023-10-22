package Pages;

import PageBase.PageBase;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.util.regex.Pattern;

public class PlaygroundNavigation extends PageBase {
    Page page;
    public Locator loadDelayNav;
    public Locator sampleAppNav;
    public Locator textInputNav;
    public Locator dynamicIdNav;
    public Locator progressBarNav;

    public PlaygroundNavigation (Page page){
      this.page = page;
      this.loadDelayNav = page.locator("a[href='/loaddelay']");
      this.sampleAppNav = page.locator("a[href='/sampleapp']");
      this.textInputNav = page.locator("a[href='/textinput']");
      this.dynamicIdNav = page.locator("a[href='/dynamicid']");
      this.progressBarNav = page.locator("a[href='/progressbar']");
    }

    public void openPlaygroundNavigation(){
        String PlaygroundNavigationUrl = ("http://uitestingplayground.com/");
        page.navigate(PlaygroundNavigationUrl);
    }

    public void clickLoadDelayAndWait(){
        loadDelayNav.click();
        page.waitForURL(Pattern.compile("http://uitestingplayground.com/loaddelay"));
    }
    public void clickSampleApp(){
        sampleAppNav.click();
        page.waitForURL(Pattern.compile("http://uitestingplayground.com/sampleapp"));
    }
    public void clickTextInput(){
        textInputNav.click();
        page.waitForURL(Pattern.compile("http://uitestingplayground.com/textinput"));
    }

    public void clickDynamicId(){
        dynamicIdNav.click();
        page.waitForURL(Pattern.compile("http://uitestingplayground.com/dynamicid"));
    }
    public void clickProgressBar(){
        progressBarNav.click();
        page.waitForURL(Pattern.compile("http://uitestingplayground.com/progressbar"));
    }


}
