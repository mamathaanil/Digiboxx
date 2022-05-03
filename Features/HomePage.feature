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
    
  Scenario: Upload multiple images
    Given I click on the add button
    And I click on the upload button
    Then I reach the folder with files
    When I select multiple images
    Then The images are uploaded to digiboxx homepage
    
  Scenario: Create new folder
    Given I click on the add button
    And I click on the create folder button
    Then I provide a filename "Mamatha"
    When I click the create button
    Then a folder "Mamatha" is created
    
    