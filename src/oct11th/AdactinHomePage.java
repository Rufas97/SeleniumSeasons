package oct11th;

import org.testng.annotations.Test;

import graphql.Assert;

public class AdactinHomePage {
	
	@Test(priority=1)
	public void loginTest()
	{
		System.out.println("Browser started...");
		System.out.println("App launched");
		Assert.assertTrue(false);
		System.out.println("Login Successful");
		System.out.println("close browser");
	}
	@Test(priority=0)
	public void registrationTest()
	{
		System.out.println("Browser started...");
		System.out.println("App launched");
		System.out.println("Registration Successful");
		System.out.println("close browser");
	}
	@Test(priority=2)
	public void forgotPasswordTest()
	{
		System.out.println("Browser started...");
		System.out.println("App launched");
		System.out.println("Forgot password");
		System.out.println("close browser");
	}
	@Test(priority=3,dependsOnMethods="loginTest")
	public void changePasswordTest()
	{
		System.out.println("Browser started...");
		System.out.println("App launched");
		System.out.println("Change password successful");
		System.out.println("close browser");
	}

}
