package Pages;

import PageBase.PageBase;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class TextInputPage extends PageBase {
Page page;
public Locator NameButtonTextField;
public Locator updatingButton;


public TextInputPage(Page page){
this.page = page;
this.NameButtonTextField = page.locator("#newButtonName");
this.updatingButton = page.locator("#updatingButton");
}

public void openTextInputPage(){
    String TextInputPageUrl = "http://uitestingplayground.com/textinput";
    page.navigate(TextInputPageUrl);
}

public void fillNameButtonTextField(){
    NameButtonTextField.click();
    NameButtonTextField.fill("Hej");
}
public void clickUpdatingButton(){
    updatingButton.click();
}
}
