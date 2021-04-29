package steps;

import org.openqa.selenium.WebDriver;

public class Tagged_Hooks {
	
	private WebDriver driver;
	
	public Tagged_Hooks(Common_Steps common_steps) {
		this.driver = common_steps.getDriver();
	}
	
}
