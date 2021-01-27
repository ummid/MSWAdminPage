package practice.AppiumFramework;

import java.io.IOException;

import org.testng.annotations.Test;

public class HomePage extends Base{

	@Test
	public void basePageNavigation() throws IOException {
		
		driver = initialiseDriver();
		driver.get("https://staging-admin.myschoolwallet.app/");
		
	}
}
