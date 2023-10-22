package Test;

import Pages.*;
import Testbase.Testbase;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Tests extends Testbase {


    @Test
    void TextInputTest(){
    PlaygroundNavigation playgroundNavigation = new PlaygroundNavigation(page);
    playgroundNavigation.openPlaygroundNavigation();
    playgroundNavigation.clickTextInput();
    TextInputPage textInputPage = new TextInputPage(page);
    textInputPage.fillNameButtonTextField();
    textInputPage.clickUpdatingButton();
    assertThat(textInputPage.updatingButton).containsText("Hej");
}

    @Test
    void loginTest(){
    PlaygroundNavigation playgroundNavigation = new PlaygroundNavigation(page);
    playgroundNavigation.openPlaygroundNavigation();
    playgroundNavigation.clickSampleApp();
    SampleAppPage sampleAppPage = new SampleAppPage(page);
    sampleAppPage.loginMethod();
    assertThat(sampleAppPage.loginbutton).containsText("Log Out");
    assertThat(sampleAppPage.loginStatus).containsText("Welcome, hejhejhej");
}
    @Test
    void loadDelayTest(){
    PlaygroundNavigation playgroundNavigation = new PlaygroundNavigation(page);
    playgroundNavigation.openPlaygroundNavigation();
    playgroundNavigation.clickLoadDelayAndWait();
    assertThat(page).hasURL("http://uitestingplayground.com/loaddelay");
}
    @Test
    void DynamicIdTest() {
        PlaygroundNavigation playgroundNavigation = new PlaygroundNavigation(page);
        playgroundNavigation.openPlaygroundNavigation();
        playgroundNavigation.clickDynamicId();
        DynamicIdPage dynamicIdPage = new DynamicIdPage(page);
        dynamicIdPage.clickDynamicIdButton();
        assertThat(dynamicIdPage.dynamicIdButton).containsText("Button with Dynamic");
    }
    @Test
    void ProgressBarTest(){
        PlaygroundNavigation playgroundNavigation = new PlaygroundNavigation(page);
        playgroundNavigation.openPlaygroundNavigation();
        playgroundNavigation.clickProgressBar();
        ProgressBarPage progressBarPage = new ProgressBarPage(page);
        progressBarPage.progressBarMethod();
        assertThat(progressBarPage.result).containsText("Result:");
        //lyckades tyvärr inte få till det med if-satsen så nu stoppar den nära 75% istället
    }



  }
