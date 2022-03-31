Feature: Sign into Digiboxx
  I want to open the app and sign in

Scenario: Login to Digiboxx
  Given I press the skip button
  Then I input the spacename
  And I input the email
  And I input the password
  Then I click the signin button
  And verify that I have reached the homepage
 