import org.junit.Test;

public class HomeWork extends TestBase{
    @Test
    public void runHomeWork(){
        loginPage.fillEmail(ADMIN_LOGIN);
        loginPage.fillPassword(ADMIN_PASSWORD);
        loginPage.clickLoginButton();
        mainPage.goToAdminPanel();
        adminPage.isHeaderDisplayed();
    }
}
