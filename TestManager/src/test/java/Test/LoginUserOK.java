package Test;

import org.junit.Before;
import org.junit.Test;

import Pages.LoginPage;

public class LoginUserOK extends BaseTest {

	
	@Before
	public void open(){
		driver.get("https://elaulaenlinea.com/login/index.php");
	}
	
	@Test
	public void loginCredenciales() {
	LoginPage loginPage = new LoginPage(driver);
	loginPage.enterCredentials("Marco07", "4564");
	loginPage.clickLoginButton();			
	}
}
