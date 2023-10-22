package Pages;

import PageBase.PageBase;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class SampleAppPage extends PageBase {
    Page page;
    public Locator loginbutton;
    public Locator usernameField;
    public Locator pwField;
    public Locator loginStatus;

    public SampleAppPage (Page page){
        this.page = page;
        this.usernameField = page.getByPlaceholder("User Name");
        this.pwField = page.getByPlaceholder("********");
        this.loginbutton = page.locator("#login");
        this.loginStatus = page.locator("#loginstatus");
    }

    public void openLoginPage(){
        String loginPageUrl = "http://uitestingplayground.com/sampleapp";
        page.navigate(loginPageUrl);
    }
    public void loginMethod(){
        usernameField.click();
        usernameField.fill("hejhejhej");
        pwField.click();
        pwField.fill("pwd");
        loginbutton.click();
    }

}
