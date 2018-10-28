import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage{

    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "login")
    WebElement loginButton;



    public void fillEmail(String identify ){
        email.sendKeys(identify);
    }

    public void fillPassword(String search){
        password.sendKeys(search);
    }
    public void clickLoginButton(){
        loginButton.click();
    }






}
