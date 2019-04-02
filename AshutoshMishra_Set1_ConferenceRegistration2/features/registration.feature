@ConferenceRegisteration
Feature: ConferenceRegisteration

Background: user wants to register so navigated to registeration page

Scenario: check the title of the registeration page
Given user is on the registeration page
Then check the title of the registration page

Scenario: check whether alert box is coming for empty First Name
Given user is on the registeration page
When user leaves First Name blank and submits
Then display alert box with first name empty message

Scenario: check whether alert box is coming for empty Last Name
Given user is on the registeration page
When user leaves Last Name blank and submits
Then display alert box with last name empty message

Scenario: check whether alert box is coming for empty email
Given user is on the registeration page
When user leaves email blank and submits
Then display alert box with email empty message

Scenario: check whether alert box is coming for wrong email
Given user is on the registeration page
When user enters wrong email format and submits
Then display alert box with wrong email format message

Scenario: check whether alert box is coming for empty contact no
Given user is on the registeration page
When user leaves contact no blank and submits
Then display alert box with contact empty message

Scenario: check whether alert box is coming for wrong contact no format
Given user is on the registeration page
When user enters wrong contact no format and submits
Then display alert box with wrong contact no format message

Scenario: check whether alert box is coming for empty number of people attending option
Given user is on the registeration page
When user leaves number of people attending blank and submits
Then display alert box with empty number of people attending

Scenario: check whether alert box is coming for empty building and room no
Given user is on the registeration page
When user leaves building and room no blank and submits
Then display alert box with building and room no empty message

Scenario: check whether alert box is coming for empty area name
Given user is on the registeration page
When user leaves area name blank and submits
Then display alert box with area name empty message

Scenario: check whether alert box is coming for empty city name
Given user is on the registeration page
When user leaves city name blank and submits
Then display alert box with city name empty message

Scenario: check whether alert box is coming for empty state column
Given user is on the registeration page
When user leaves state column blank and submits
Then display alert box with state column empty message

Scenario: check whether alert box is coming for empty membership status
Given user is on the registeration page
When user leaves membership status blank and submits
Then display alert box with membership status empty message

Scenario: check whether alert box is coming for valid data
Given user is on the registeration page
When user enters vall valid data and submits
Then display alert box with registration success message
And navigate to payment page