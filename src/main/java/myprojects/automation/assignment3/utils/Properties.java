package myprojects.automation.assignment3.utils;

import org.openqa.selenium.remote.BrowserType;

/**
 * Help class to get passed parameters from environment for further usage in the automation project
 */
public class Properties {
    private static final String DEFAULT_BASE_URL = "http://prestashop-automation.qatestlab.com.ua/";
    private static final String DEFAULT_BASE_ADMIN_URL = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
    private static final String DEFAULT_BROWSER = BrowserType.CHROME;
    private static final String DEFAULT_LOGIN = "webinar.test@gmail.com";
    private static final String DEFAULT_PASSWORD = "Xcg7299bnSmMuRLp9ITw";

    /**
     *
     * @return Website frontend.
     */
    public static String getBaseUrl() {
        return System.getProperty(EnvironmentVariables.BASE_URL.toString(), DEFAULT_BASE_URL);
    }

    /**
     *
     * @return Website backend (ULR of the Admin Panel.)
     */
    public static String getBaseAdminUrl() {
        return System.getProperty(EnvironmentVariables.BASE_ADMIN_URL.toString(), DEFAULT_BASE_ADMIN_URL);
    }

    /**
     *
     * @return The name of the browser that need to be used for execution.
     */
    public static String getBrowser() {
        return System.getProperty(EnvironmentVariables.BROWSER.toString(), DEFAULT_BROWSER);
    }

    /**
     *
     * @return The user's login.
     */
    public static String getLogin() {
        return System.getProperty(EnvironmentVariables.LOGIN.toString(), DEFAULT_LOGIN);
    }

    /**
     *
     * @return The user's password.
     */
    public static String getPassword() {
        return System.getProperty(EnvironmentVariables.PASSWORD.toString(), DEFAULT_PASSWORD);
    }

}

/**
 * All parameters that are passed to automation project
 */
enum EnvironmentVariables {
    BASE_URL("env.url"),
    BASE_ADMIN_URL("env.admin.url"),
    BROWSER("browser"),
    LOGIN("login"),
    PASSWORD("password");

    private String value;
    EnvironmentVariables(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}