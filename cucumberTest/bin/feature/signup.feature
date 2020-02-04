
#Author: your.email@your.domain.com


  Feature: Testing the sign up page facebook
  Scenario: signup testing with valid credentials for facebook
    Given user is on the  facebook signup page for facebook
    When  user enters first name for facebook "Anil"
    And  user enters  last name  for  facebook "Sharma"
    And user enters  mobile number or email id for facebook "9834357789" 
    And user re enters email id 
    
    And    user enters new password for facebook "QWX#123"
    And user select birthday month "Feb"
    And user select  date "15"
    And user select year"1985"
    
    And user select gender
    And user click on signup button "click signbutton"
    Then user is able navigate to new facebook account for sign up
