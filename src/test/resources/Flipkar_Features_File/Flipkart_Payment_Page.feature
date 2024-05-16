@Payment
@Regrassion
Feature: To Validate the Flipkart Application

  Scenario: To validate the Flipkart Payment Page
    Given Launch the Filpkart Application
    When  Click the Search Bar
    And  Enter the Search Product Name
    And  Click the Search Icon button
    Then Validate the Search Product page
     When Click the Anyone shirt
    When Click the Add to Cart button
    Then Validate Place Order should displayed
    When Click the Place order button
    Then Validate the login page
    When Enter the login phone number in text box
    And  Click the continue button
    Then Validate the OTP text box should display
    When Click the Login button
    Then Validate the Delivery Adderss page
    When Click Add new Address
    And Enter the name
    And Enter the moblie number
    And Enter the pincode
    And Enter the locality
    And Enter the Address
    And Enter the Landmark
		And Enter the Alternate number     
		And Select the Home delivery button
		And Click the save and delivery
