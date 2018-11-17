package myprojects.automation.assignment3;

import myprojects.automation.assignment3.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Contains main script actions that may be used in scripts.
 */
public class GeneralActions {
    private WebDriver driver;
    private WebDriverWait wait;

    public GeneralActions(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    /**
     * Logs in to Admin Panel.
     * @param login - user's email
     * @param password - user's password
     */
    public void login(String login, String password) {
        driver.get(Properties.getBaseAdminUrl());
        // Type the email as a login
        WebElement loginInput = driver.findElement(By.id("email"));
        loginInput.sendKeys(login);
        // Type the password
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        passwordInput.sendKeys(password);
        // Submit the login form
        WebElement submitButton = driver.findElement(By.name("submitLogin"));
        submitButton.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("imgm")));
    }

    /**
     * Adds new category in Admin Panel.
     * @param categoryName - a category name
     */
    public void createCategory(String categoryName) {
        WebElement catalog = driver.findElement(By.cssSelector("[data-submenu=\"9\"]"));
        WebElement category = driver.findElement(By.cssSelector("[data-submenu=\"11\"]"));
        Actions actions = new Actions(driver) ;
        actions.moveToElement(catalog)
                .pause(1000)
                .click(category)
                .build()
                .perform();

        waitForContentLoad();

        // create category
        WebElement addCategory = driver.findElement(By.id("page-header-desc-category-new_category"));
        addCategory.click();

        WebElement categoryInput = driver.findElement(By.cssSelector(".copy2friendlyUrl"));
        categoryInput.sendKeys(categoryName);
        WebElement categorySubmitButton = driver.findElement(By.id("category_form_submit_btn"));
        categorySubmitButton.submit();

        waitForContentLoad();
    }

    /**
     * Waits until page loader disappears from the page
     */
    public void waitForContentLoad() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("content")));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ajax_running")));
    }

}
