package stepdefinition;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearch {
	
	@Given("Log into Amazon website using my credentials having user name {string} and password {string}")
	public void log_into_amazon_website_using_my_credentials_having_user_name_and_password(String Uname, String Password) {
		
		System.out.println("User name  is "+ Uname + " Password is "+ Password);
	    
	}

	@When("Enter key word {string} in search along with price range with in {int} and hit enter")
	public void enter_key_word_in_search_along_with_price_range_with_in_and_hit_enter(String bookname, Integer price) {
		
		System.out.println("book name  is "+bookname+ " Price is " + price);
		
	    
	}

	@Then("List the search outcome and select the required book to purchase")
	public void list_the_search_outcome_and_select_the_required_book_to_purchase() {
		
		
		System.out.println("book is selected and added to the cart for purchase");
	}

	

}
