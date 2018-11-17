package myprojects.automation.assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventHandler implements WebDriverEventListener {

    public void afterClickOn(WebElement arg0, WebDriver arg1) {
        System.out.println("Inside method afterClickOn on " + arg0);
    }

    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("Inside method beforeChangeValueOf on " + webElement);
    }


    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        System.out.println("Inside method afterChangeValueOf on " + webElement);
    }

    public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
        System.out.println("Find happened on " + arg1 + " Using method " + arg0);
    }

    public void afterNavigateBack(WebDriver arg0) {
        System.out.println("Inside the afterNavigateBack to " + arg0.getCurrentUrl());
    }

    public void afterNavigateForward(WebDriver arg0) {
        System.out.println("Inside the afterNavigateForward to " + arg0.getCurrentUrl());
    }


    public void beforeNavigateRefresh(WebDriver webDriver) {
        System.out.println("inside method beforeNavigateRefresh to " + webDriver.getCurrentUrl());
    }


    public void afterNavigateRefresh(WebDriver webDriver) {
        System.out.println("inside method afterNavigateRefresh to " + webDriver.getCurrentUrl());
    }

    public void afterNavigateTo(String arg0, WebDriver arg1) {
        System.out.println("Inside the afterNavigateTo to " + arg0);
    }

    public void afterScript(String arg0, WebDriver arg1) {
        System.out.println("Inside the afterScript to, Script is " + arg0);
    }

    public void beforeClickOn(WebElement arg0, WebDriver arg1) {
        System.out.println("About to click on the " + arg0);
    }

    public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
        System.out.println("Just before finding element " + arg1);
    }

    public void beforeNavigateBack(WebDriver arg0) {
        System.out.println("Just before beforeNavigateBack " + arg0.getCurrentUrl());
    }

    public void beforeNavigateForward(WebDriver arg0) {
        System.out.println("Just before beforeNavigateForward " + arg0.getCurrentUrl());
    }

    public void beforeAlertAccept(WebDriver webDriver) {
        System.out.println("inside method beforeAlertAccept to " + webDriver.getCurrentUrl());
    }

    public void afterAlertAccept(WebDriver webDriver) {
        System.out.println("inside method afterAlertAccept to " + webDriver.getCurrentUrl());
    }


    public void afterAlertDismiss(WebDriver webDriver) {
        System.out.println("inside method afterAlertDismiss to " + webDriver.getCurrentUrl());
    }

    public void beforeAlertDismiss(WebDriver webDriver) {
        System.out.println("inside method beforeAlertDismiss to " + webDriver.getCurrentUrl());
    }

    public void beforeNavigateTo(String arg0, WebDriver arg1) {
        System.out.println("Just before beforeNavigateTo " + arg0);
    }

    public void beforeScript(String arg0, WebDriver arg1) {
        System.out.println("Just before beforeScript " + arg0);
    }

    public void onException(Throwable arg0, WebDriver arg1) {
        System.out.println("Exception occured at " + arg0.getMessage());
    }

}