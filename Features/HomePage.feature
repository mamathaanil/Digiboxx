Feature: Sign into Digiboxx
  I want to open the app and sign in

  Background:
    Given I press the skip button
    Then I input the spacename
    And I input the email
    And I input the password
    Then I click the signin button
    And verify that I have reached the homepage
 
  Scenario: Upload a single image
    Given I click on the add button
    And I click on the upload button
    Then I reach the folder with files
    When I click on single image
    Then The image is uploaded to digiboxx homepage