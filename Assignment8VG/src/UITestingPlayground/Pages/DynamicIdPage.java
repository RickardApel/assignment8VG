package Pages;

import PageBase.PageBase;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class DynamicIdPage extends PageBase {
    Page page;
    public Locator dynamicIdButton;

    public DynamicIdPage(Page page){
        this.page = page;
        this.dynamicIdButton = page.locator("button.btn.btn-primary:has-text('Button with Dynamic ID')");
    }

    public void clickDynamicIdButton(){
        dynamicIdButton.click();

    }
}
