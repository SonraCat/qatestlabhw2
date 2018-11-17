package myprojects.automation.assignment3.tests;

import myprojects.automation.assignment3.BaseScript;
import myprojects.automation.assignment3.GeneralActions;
import myprojects.automation.assignment3.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.UUID;

public class CreateCategoryTest extends BaseScript {
    public static void main(String[] args) {
        WebDriver driver = getConfiguredDriver();
        GeneralActions generalActions = new GeneralActions(driver);

        // Login in to account
        generalActions.login(Properties.getLogin(), Properties.getPassword());
        generalActions.waitForContentLoad();

        //  Create new category with random name
        String categoryName = UUID.randomUUID().toString();
        generalActions.createCategory(categoryName);

        // check the alert appears after save new category
        WebElement alertSuccess = driver.findElement(By.cssSelector(".alert-success"));
        System.out.println(alertSuccess.isDisplayed());

        // back to list with all categories
        WebElement backToList = driver.findElement(By.id("desc-category-back"));
        backToList.click();
        generalActions.waitForContentLoad();

        // check the filtration by name
        WebElement inputFilterName = driver.findElement(By.name("categoryFilter_name"));
        inputFilterName.sendKeys(categoryName);
        WebElement submitFilterButtonCategory = driver.findElement(By.id("submitFilterButtoncategory"));
        submitFilterButtonCategory.submit();

        generalActions.waitForContentLoad();

        // check that new category appears in Categories table
        WebElement createdCategory = driver.findElement(By.xpath("//*[@id=\"table-category\"]/tbody/tr[1]/td[3]"));
        System.out.println(createdCategory.getText().equals(categoryName));

        driver.quit();
    }
}
