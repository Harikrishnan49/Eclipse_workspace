package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import static io.restassured.RestAssured.*;

public class StepDefinitionClass {
	@Given("I want to get the available pets in the store")
	public void i_want_to_get_the_available_pets_in_the_store() {
	    // Write code here that turns the phrase above into concrete actions
	    given().when().get("https://petstore.swagger.io/v2/pet/findByStatus?status=available").
	    then().statusCode(200).statusLine("HTTP/1.1 200 OK")
		.assertThat().body("status", everyItem(equalTo("available")))
		.header("Server", "Jetty(9.2.9.v20150224)")
	    .log().all();
	}
	public static HashMap category = new HashMap();
	public static HashMap pet = new HashMap();
	public static HashMap tag = new HashMap();
	Random random = new Random();
	int id = ThreadLocalRandom.current().nextInt(1000, 5000);
	int categoryid = ThreadLocalRandom.current().nextInt(1000, 5000);
	int tagid = ThreadLocalRandom.current().nextInt(1000, 5000);
	@When("I need to post a new pet as available in the store")
	public void i_need_to_post_a_new_pet_as_available_in_the_store() {
	    // Write code here that turns the phrase above into concrete actions
		pet.put("id", id);
		pet.put("name", "elephant");
		pet.put("status", "available");
		pet.put("photoUrls", List.of("image of mammals"));
		category.put("id", categoryid);
		category.put("name", "Mammals");
		tag.put("id", tagid); 
		tag.put("name", "african"); 
		List<Map<String, Object>> tags = new ArrayList<>();
	    tags.add(tag);
		pet.put("category", category);
		pet.put("tags", tags);
		
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		RestAssured.basePath="/pet";
		
		given().contentType("application/json").body(pet)
		.when().post().then().statusCode(200).log().all();
	    
	}
	@When("I need to update the status of the pet as sold")
	public void i_need_to_update_the_status_of_the_pet_as_sold() {
	    // Write code here that turns the phrase above into concrete actions
		pet.put("name", "elephant");
	    pet.put("status", "sold");
	    
	    RestAssured.baseURI="https://petstore.swagger.io/v2";
		RestAssured.basePath="/pet";
		
		given().contentType("application/json").body(pet)
		.when().put().then().statusCode(200).body("id", equalTo(id)).log().all();
	}

	//int id = 77;
	@Then("I need to delete that pet")
	public void i_need_to_delete_that_pet() {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		RestAssured.basePath="/pet/"+id;
		
		given().contentType("application/json")
		.when().delete().then().statusCode(200).log().all();
	}
}
