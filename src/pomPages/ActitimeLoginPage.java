package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {
	@FindBy(name="username") private WebElement usernameTextField;
	@FindBy(name="pwd") private WebElement passwordTextField;
	@FindBy(id="loginButton") private WebElement loginButton;
	public ActitimeLoginPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
    public void sendkeysusernameTextField(String username) {
    	usernameTextField.sendKeys(username);
    	}
    public void sendkeyspasswordTextField(String username) {
    	passwordTextField.sendKeys(username);
    }
    public void loginclickButton() {
    	loginButton.click();
    }
}
