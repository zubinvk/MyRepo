package StepDefinition;

import io.cucumber.java.en.*;

public class UberBookingSteps {
	@Given("User wants to select the car type {string} From Uber App")
	public void user_wants_to_select_the_car_type_From_Uber_App(String CarType) {
		System.out.println(CarType);
	}

	@When("User selects car {string} and pick up point as {string} and drop {string}")
	public void user_selects_car_and_pick_up_point_as_and_drop(String CarType, String Pickuplocatoin, String Droplocation) {
		System.out.println(CarType + "-" + Pickuplocatoin+" - "+ Droplocation);
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
	}

	@Then("User Pays {int} USD")
	public void user_Pays_USD(Integer Price) {
		System.out.println(Price);
	}

}
