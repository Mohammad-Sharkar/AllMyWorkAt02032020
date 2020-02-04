#Author: Basanta

Feature: Register mercury


  
  Scenario: Register 
  with valid credentails
    Given user is  on mercury register home page
    When  user enters  first name 
    And   user enter last name 
    And  user enter phone number
    And  user enter email 
    And user enter address1 
    And user enter address 2 
    And user enter  city 
    And  user enter State
    And user enter postal code 
    And user select country 
    And user enter user name 
    And user enter password 
    And user enter conform password 
    And user click on submit button
    Then user is able to navigate to new account 
  