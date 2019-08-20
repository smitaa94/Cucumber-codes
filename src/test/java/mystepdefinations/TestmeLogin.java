package mystepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestmeLogin
{
	WebDriver driver;
	@Given("test me is launched by user")
	
	public void test_me_is_launched_by_user() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\SeleniumBroDrivers\\SeleniumBroDrivers\\chromedriver.exe\\");
		  driver =new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm#");
	}

	@When("user clicks on sign in link")
	public void user_clicks_on_sign_in_link() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@Then("user provides valid username {string}")
	public void user_provides_valid_username(String string1) {
	    driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string1);
	}

	@Then("user provides valid password {string}")
	public void user_provides_valid_password(String string2) {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string2);
	}

	@Then("user clicks for submission of the date")
	public void user_clicks_for_submission_of_the_date() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Then("verifies the login status for account")
	public void verifies_the_login_status_for_account() {
	    // Write code here that turns the phrase above into concrete actions
	    String expected="SignOut";
	    String actual=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).getText();
	    Assert.assertEquals(expected, actual);
	    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/a")).click();
	}
	

}
