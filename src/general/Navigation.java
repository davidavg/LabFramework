package general;

import org.openqa.selenium.WebDriver;

public class Navigation extends BasicFunctions{
	
	BasicFunctions init;
	
	public void login(String strUser, String strPswd) {
		System.out.println("--> Navigation --> Login with User: " + strUser + ", Password: " + strPswd);
	}
	
	public void navigateAccount(WebDriver driver) {
		System.out.println("--> Navigation --> Navigate to \"Account\" screen");
	}
	
	public void navigateOrder(WebDriver driver) {
		System.out.println("--> Navigation --> Navigate to \"Order\" screen");
	}
	
	public void navigateMyOrders(WebDriver driver) {
		System.out.println("--> Navigation --> Navigate to \"MyOrder\" screen");
	}
	
	public void navigateCreateOrder(WebDriver driver) {
		System.out.println("--> Navigation --> Navigate to \"CreateOrder\" screen");
	}
}
