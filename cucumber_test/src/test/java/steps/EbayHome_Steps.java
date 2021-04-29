package steps;

import static org.junit.Assert.fail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.Common_Actions;
import actions.EbayHome_Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps {

	Common_Actions common_actions;
	EbayHome_Actions ebayhome_actions;
	
	public EbayHome_Steps(Common_Actions common_actions, EbayHome_Actions ebayhome_actions) {
		this.common_actions = common_actions;
		this.ebayhome_actions = ebayhome_actions;
	}
	
	@Given("I am on Eaby Home Page")
	public void i_am_on_Eaby_Home_Page() {
	   common_actions.goToUrl("https://www.ebay.com/");
	}
	
	@When("I serach for {string}")
	public void i_serach_for_iPhone_11(String str1) throws Exception {
		ebayhome_actions.searchAnItem(str1);
		ebayhome_actions.clickSearchButton();
		Thread.sleep(1000);
	}
	
	@Then("I validate atleast {int} search items present")
	public void i_validate_atleast_search_items_presentint (int count) {
	    int itemCountInt = ebayhome_actions.getSeatchItemsCount();
	    if(itemCountInt <= count) {
	    	fail("Less than 1000 results shown");
	    }
	}
	
}
