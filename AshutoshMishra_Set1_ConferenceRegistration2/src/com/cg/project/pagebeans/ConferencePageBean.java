package com.cg.project.pagebeans;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;

public class ConferencePageBean {
	WebDriver driver;
	public ConferencePageBean(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	/*********Locating Elements*********/
	@FindBy(xpath= ".//*[@id='txtFirstName']")
	@CacheLookup
	WebElement pffName;
	@FindBy(xpath= ".//*[@id='txtLastName']")
	@CacheLookup
	WebElement pflName;
	@FindBy(xpath= ".//*[@id='txtEmail']")
	@CacheLookup
	WebElement pfEmail;
	@FindBy(xpath= ".//*[@id='txtPhone']")
	@CacheLookup
	WebElement pfPhoneNo;
	@FindBy(name= "size")
	@CacheLookup
	WebElement pfNoOfPeopleAttending;
	@FindBy(xpath= ".//*[@id='txtAddress1']")
	@CacheLookup()
	WebElement pfBuildNameRoomNo;
	@FindBy(xpath= ".//*[@id='txtAddress2']")
	@CacheLookup
	WebElement pfAreaName;
	@FindBy(name= "city")
	@CacheLookup
	WebElement pfCity;
	@FindBy(name= "state")
	@CacheLookup
	WebElement pfState;
	@FindBy(name= "memberStatus")
	@CacheLookup
	List<WebElement> pfMembershipStatus;
	@FindBy(linkText= "Next")
	@CacheLookup
	WebElement pfSubmit;
	
	@FindBy(xpath= ".//*[@id='txtCardholderName']")
	@CacheLookup
	WebElement pfCardHolderName;
	@FindBy(xpath= ".//*[@id='txtDebit']")
	@CacheLookup
	WebElement pfCardNumber;
	@FindBy(xpath= ".//*[@id='txtCvv']")
	@CacheLookup
	WebElement pfCvv;
	@FindBy(xpath= ".//*[@id='txtMonth']")
	@CacheLookup
	WebElement pfExpMonth;
	@FindBy(xpath= ".//*[@id='txtYear']")
	@CacheLookup
	WebElement pfExpYear;
	@FindBy(xpath= ".//*[@id='btnPayment']")//*[@id="btnPayment"]
	@CacheLookup
	WebElement pfMakePayment;
	
	/***********Getters and Setters**************/
	public WebElement getPffName() {
		return pffName;
	}
	public void setPffName(String sfName) {
		pffName.sendKeys(sfName);
	}
	public WebElement getPflName() {
		return pflName;
	}
	public void setPflName(String slName) {
		pflName.sendKeys(slName);
	}
	public WebElement getPfEmail() {
		return pfEmail;
	}
	public void setPfEmail(String sEmail) {
		pfEmail.sendKeys(sEmail);
	}
	public WebElement getPfPhoneNo() {
		return pfPhoneNo;
	}
	public void setPfPhoneNo(String sPhoneNo) {
		pfPhoneNo.sendKeys(sPhoneNo);
	}
	public WebElement getPfNoOfPeopleAttending() {
		return pfNoOfPeopleAttending;
	}
	public void setPfNoOfPeopleAttending(String sNoOfPeopleAttending) {
		pfNoOfPeopleAttending.sendKeys(sNoOfPeopleAttending);
	}
	public WebElement getPfBuildNameRoomNo() {
		return pfBuildNameRoomNo;
	}
	public void setPfBuildNameRoomNo(String sBuildNameRoomNo) {
		pfBuildNameRoomNo.sendKeys(sBuildNameRoomNo);
	}
	public WebElement getPfAreaName() {
		return pfAreaName;
	}
	public void setPfAreaName(String sAreaName) {
		pfAreaName.sendKeys(sAreaName);
	}
	public WebElement getPfCity() {
		return pfCity;
	}
	public void setPfCity(String sCity) {
		Select drpCity= new Select(pfCity);
		drpCity.selectByVisibleText(sCity);
	}
	public WebElement getPfState() {
		return pfState;
	}
	public void setPfState(String sState) {
		new Select(pfState).selectByVisibleText(sState);
	}
	public List<WebElement> getPfMembershipStatus() {
		return pfMembershipStatus;
	}
	public void setPfMembershipStatus(String str) {
		for (WebElement webElement : pfMembershipStatus) {
			if(webElement.getAttribute("value").equals(str))
				webElement.click();
		}
	}
	public WebElement getPfSubmit() {
		return pfSubmit;
	}
	public void setPfSubmit() {
		pfSubmit.click();
	}
	public WebElement getPfCardHolderName() {
		return pfCardHolderName;
	}
	public void setPfCardHolderName(String sCardHolderName) {
		pfCardHolderName.sendKeys(sCardHolderName);
	}
	public WebElement getPfCardNumber() {
		return pfCardNumber;
	}
	public void setPfCardNumber(String sCardNumber) {
		pfCardNumber.sendKeys(sCardNumber);
	}
	public WebElement getPfCvv() {
		return pfCvv;
	}
	public void setPfCvv(String sCvv) {
		pfCvv.sendKeys(sCvv);
	}
	public WebElement getPfExpMonth() {
		return pfExpMonth;
	}
	public void setPfExpMonth(String sExpMonth) {
		pfExpMonth.sendKeys(sExpMonth);
	}
	public WebElement getPfExpYear() {
		return pfExpYear;
	}
	public void setPfExpYear(String sExpYear) {
		pfExpYear.sendKeys(sExpYear);
	}
	public WebElement getPfMakePayment() {
		return pfMakePayment;
	}
	public void setPfMakePayment() {
		pfMakePayment.click();
	}
}
