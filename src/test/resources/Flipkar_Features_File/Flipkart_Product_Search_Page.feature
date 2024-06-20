@new
Feature: To Validate the Flipkart Application

@Regrassion
  Scenario: To Validate the Flipkart Product Search Page
  
    Given Launch the Filpkart Application
    When  Click the Search Bar
    And  Enter the Search Product Name
    And  Click the Search Icon button
    Then Validate the Search Product page
    
@Regrassion
  Scenario: To Validate the Flipkart Add To Cart Page
  
    When Click the Anyone shirt
    When Click the Add to Cart button
    Then Validate Place Order should displayed
    
@Regrassion
  Scenario: To Validate the Place order and Login
  
    When Click the Place order button
    Then Validate the login page
    When Enter the login phone number in text box
    And  Click the continue button
    Then Validate the OTP text box should display
    
@Regrassion
  Scenario: To Validate Remove the Product from cart
  
    When Click Cart link
    Then Validate the Cart page
    When Click the Remove option
    And  Click the Remove option the popup
    Then Validate the product remove from cart
