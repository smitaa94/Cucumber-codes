package mystepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Tags {
	@Given("Flipkart is launched by the user")
	public void flipkart_is_launched_by_the_user() {
	    System.out.println("Flipkart");
	}

	@Then("valid credentials are entered by user")
	public void valid_credentials_are_entered_by_user() {
	    // Write code here that turns the phrase above into concrete actions

		System.out.println("Login code");
	}

	@Then("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    
	    System.out.println("Submit code");
	}

	@Given("user searching the product with code")
	public void user_searching_the_product_with_code() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Search product code");
	}

	@Then("user able to add it to cart")
	public void user_able_to_add_it_to_cart() {
	    System.out.println("Add to cart code");
	}

	@Given("user able to see item count on cart")
	public void user_able_to_see_item_count_on_cart() {
	    System.out.println("Count item court");
	}

	@Then("user removes product from cart")
	public void user_removes_product_from_cart() {
	    // Write code here that turns the phrase above into concrete actions

System.out.println("Remove product code");
	}

	@Given("user has active order")
	public void user_has_active_order() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Active order code");
	}

	@Then("user verifies the status of order")
	public void user_verifies_the_status_of_order() {
		System.out.println("Status of order code");
	}
	}


