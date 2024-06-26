package StepDefinition;

import io.cucumber.java.en.*;

public class SearchSteps {

	@Given("I have a search field in the Amazon page")
	public void i_have_a_search_field_in_the_Amazon_page() {
		System.out.println("Printinhg -- I have a search field in the Amazon page");
	}

	@When("I search for Product {string} and the price {int}")
	public void i_search_for_Product_and_the_price(String string, Integer int1) {
		System.out.println("Printing --  "+ string +" - - "+ int1);
	}

	@Then("Product Name with the {string} should be displayed")
	public void product_Name_with_the_should_be_displayed(String string) {
		System.out.println(string);
	}

}
