#Author: your.email@your.domain.com



Feature: Testing the signup functionalites

  
  Scenario: signup module
    
    Given user is on the facebook signup page

   When user enter first name for facebook  page
    And  user enter last name for facebook page
    And user enter mobile number for facebook page
    And user enter new password for facebook page
    And user select month for facebook page
    And user select day for facebook page
    And user select year for facebook page
    And user select gender for facebook page
    And  user clicks on sign up button for facebook page
    Then new account for user should be created for facebook page
    And user shoould navigate to the new account for facebook page
  
 

  