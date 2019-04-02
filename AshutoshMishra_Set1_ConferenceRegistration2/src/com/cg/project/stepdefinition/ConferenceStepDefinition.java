package com.cg.project.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cg.project.pagebeans.ConferencePageBean;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConferenceStepDefinition {

	private WebDriver driver;
	private ConferencePageBean rpg;

	@Before
	public void openBrowsser() {
		String driverPath = "D:\\software backup\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);	
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		rpg = new ConferencePageBean(driver);

		driver.get("D:\\3000175_Ashutosh_Mishra\\BDDCucumberSelenium\\ConferenceRegistartion.html");
	}

	//Method for handling alert message
	public void callAlert() throws InterruptedException {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("TestCase :4\n****** " + alertMessage);
		driver.close();
	}

	//Open Browser
	@Given("^user is on the registeration page$")
	public void user_is_on_the_registeration_page() throws Throwable {
		openBrowsser();
	}

	//Title Match
	@Then("^check the title of the registration page$")
	public void check_the_title_of_the_registration_page() throws Throwable {
		if(driver.getTitle().equals("Conference Registartion")) 
			System.out.println("TestCase :1\n**** Title Matched");
		else
			System.out.println("**** Title Not Matched");
	}

	//First Name Blank
	@When("^user leaves First Name blank and submits$")
	public void user_leaves_First_Name_blank_and_submits() throws Throwable {
		rpg.setPffName("");
		rpg.setPfSubmit();
	}

	@Then("^display alert box with first name empty message$")
	public void display_alert_box_with_first_name_empty_message() throws Throwable {
		callAlert();
	}

	//Last Name Blank
	@When("^user leaves Last Name blank and submits$")
	public void user_leaves_Last_Name_blank_and_submits() throws Throwable {
		rpg.setPffName("Ashutosh ");
		rpg.setPflName("");
		rpg.setPfSubmit();
	}

	@Then("^display alert box with last name empty message$")
	public void display_alert_box_with_last_name_empty_message() throws Throwable {
		callAlert();
	}

	//Email Blank
	@When("^user leaves email blank and submits$")
	public void user_leaves_email_blank_and_submits() throws Throwable {
		rpg.setPffName("Ashutosh");
		rpg.setPflName("Mishra");
		rpg.setPfEmail("");
		rpg.setPfSubmit();
	}

	@Then("^display alert box with email empty message$")
	public void display_alert_box_with_email_empty_message() throws Throwable {
		callAlert();
	}

	//Wrong Email
	@When("^user enters wrong email format and submits$")
	public void user_enters_wrong_email_format_and_submits() throws Throwable {
		rpg.setPffName("Ashutosh");
		rpg.setPflName("Mishra");
		rpg.setPfEmail("ashu@gmailcom");
		rpg.setPfSubmit();
	}

	@Then("^display alert box with wrong email format message$")
	public void display_alert_box_with_wrong_email_format_message() throws Throwable {
		callAlert();
	}

	//Contact No Blank
	@When("^user leaves contact no blank and submits$")
	public void user_leaves_contact_no_blank_and_submits() throws Throwable {rpg.setPffName("Anmol");
	rpg.setPffName("Ashutosh");
	rpg.setPflName("Mishra");
	rpg.setPfEmail("ashu@gmailcom");
	rpg.setPfPhoneNo("");
	rpg.setPfSubmit();
	}

	@Then("^display alert box with contact empty message$")
	public void display_alert_box_with_contact_empty_message() throws Throwable {
		callAlert();
	}

	//Wrong contact no format
	@When("^user enters wrong contact no format and submits$")
	public void user_enters_wrong_contact_no_format_and_submits() throws Throwable {
		rpg.setPffName("Ashutosh");
		rpg.setPflName("Mishra");
		rpg.setPfEmail("ashu@gmail.com");
		rpg.setPfPhoneNo("999995");
		rpg.setPfSubmit();
	}


	@Then("^display alert box with wrong contact no format message$")
	public void display_alert_box_with_wrong_contact_no_format_message() throws Throwable {
		callAlert();
	}

	@When("^user leaves number of people attending blank and submits$")
	public void user_leaves_number_of_people_attending_blank_and_submits() throws Throwable {
		rpg.setPffName("Ashutosh");
		rpg.setPflName("Mishra");
		rpg.setPfEmail("ashu@gmail.com");
		rpg.setPfPhoneNo("9998888999");
		rpg.setPfNoOfPeopleAttending("");
		rpg.setPfSubmit();
	}

	@Then("^display alert box with empty number of people attending$")
	public void display_alert_box_with_empty_number_of_people_attending() throws Throwable {
		callAlert();
	}

	//Building Number and room number empty
	@When("^user leaves building and room no blank and submits$")
	public void user_leaves_building_and_room_no_blank_and_submits() throws Throwable {
		rpg.setPffName("Ashutosh");
		rpg.setPflName("Mishra");
		rpg.setPfEmail("ashu@gmail.com");
		rpg.setPfPhoneNo("9998888999");
		rpg.setPfNoOfPeopleAttending("2");
		rpg.setPfBuildNameRoomNo("");
		rpg.setPfSubmit();
	}

	@Then("^display alert box with building and room no empty message$")
	public void display_alert_box_with_building_and_room_no_empty_message() throws Throwable {
		callAlert();
	}

	//Empty Area Name
	@When("^user leaves area name blank and submits$")
	public void user_leaves_area_name_blank_and_submits() throws Throwable {
		rpg.setPffName("Ashutosh");
		rpg.setPflName("Mishra");
		rpg.setPfEmail("ashu@gmail.com");
		rpg.setPfPhoneNo("9998888999");
		rpg.setPfNoOfPeopleAttending("2");
		rpg.setPfBuildNameRoomNo("B No 51, R No 45");
		rpg.setPfAreaName("");
		rpg.setPfSubmit();
	}

	@Then("^display alert box with area name empty message$")
	public void display_alert_box_with_area_name_empty_message() throws Throwable {
		callAlert();
	}

	//Empty City name
	@When("^user leaves city name blank and submits$")
	public void user_leaves_city_name_blank_and_submits() throws Throwable {
		rpg.setPffName("Ashutosh");
		rpg.setPflName("Mishra");
		rpg.setPfEmail("ashu@gmail.com");
		rpg.setPfPhoneNo("9998888999");
		rpg.setPfNoOfPeopleAttending("2");
		rpg.setPfBuildNameRoomNo("B No 51, R No 45");
		rpg.setPfAreaName("Marine Drive");
		rpg.setPfCity("");
		rpg.setPfSubmit();
	}

	@Then("^display alert box with city name empty message$")
	public void display_alert_box_with_city_name_empty_message() throws Throwable {
		callAlert();
	}

	//State Name Blank
	@When("^user leaves state column blank and submits$")
	public void user_leaves_state_column_blank_and_submits() throws Throwable {
		rpg.setPffName("Ashutosh");
		rpg.setPflName("Mishra");
		rpg.setPfEmail("ashu@gmail.com");
		rpg.setPfPhoneNo("9998888999");
		rpg.setPfNoOfPeopleAttending("2");
		rpg.setPfBuildNameRoomNo("B No 51, R No 45");
		rpg.setPfAreaName("Marine Drive");
		rpg.setPfCity("Pune");
		rpg.setPfState("");
		rpg.setPfSubmit();
	}

	@Then("^display alert box with state column empty message$")
	public void display_alert_box_with_state_column_empty_message() throws Throwable {
		callAlert();
	}

	//MemberShip Status Blank
	@When("^user leaves membership status blank and submits$")
	public void user_leaves_membership_status_blank_and_submits() throws Throwable {
		rpg.setPffName("Ashutosh");
		rpg.setPflName("Mishra");
		rpg.setPfEmail("ashu@gmail.com");
		rpg.setPfPhoneNo("9998888999");
		rpg.setPfNoOfPeopleAttending("2");
		rpg.setPfBuildNameRoomNo("B No 51, R No 45");
		rpg.setPfAreaName("Marine Drive");
		rpg.setPfCity("Pune");
		rpg.setPfState("Maharashtra");
		rpg.setPfSubmit();
	}

	@Then("^display alert box with membership status empty message$")
	public void display_alert_box_with_membership_status_empty_message() throws Throwable {
		callAlert();
	}

	//All Valid Data entered show success message and then navigate to next page
	@When("^user enters vall valid data and submits$")
	public void user_enters_vall_valid_data_and_submits() throws Throwable {
		rpg.setPffName("Ashutosh");
		rpg.setPflName("Mishra");
		rpg.setPfEmail("ashu@gmail.com");
		rpg.setPfPhoneNo("9998888999");
		rpg.setPfNoOfPeopleAttending("2");
		rpg.setPfBuildNameRoomNo("B No 51, R No 45");
		rpg.setPfAreaName("Marine Drive");
		rpg.setPfState("Maharashtra");
		rpg.setPfSubmit();
	}

	@Then("^display alert box with registration success message$")
	public void display_alert_box_with_registration_success_message() throws Throwable {
		callAlert();
	}

	@Then("^navigate to payment page$")
	public void navigate_to_payment_page() throws Throwable {
		driver.navigate().to("D:\\3000175_Ashutosh_Mishra\\BDDCucumberSelenium\\PaymentDetails.html");
	}
	@After
	public void closeBrowser() {
		driver.close();
	}
}
