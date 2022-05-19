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
    When I click on single image
    Then The image is uploaded to digiboxx homepage
    
  Scenario: Upload multiple images
    Given I click on the add button
    And I click on the upload button
    When I select multiple images
    Then The images are uploaded to digiboxx homepage
    
  Scenario: Create new folder
    Given I click on the add button
    And I click on the create folder button
    Then I provide a filename "Mamatha"
    When I click the create button
    Then a folder "Mamatha" is created
    
  Scenario: Rename folder
    Given I click on the add button
    And I click on the create folder button
    Then I provide a filename "HowRU"
    When I click the create button
    Then a folder "HowRU" is created
    And I click on the menu button
    And I click on the rename option
    Then I rename folder with "NewName"
    When I click the rename folder button
    Then a folder "NewName" is created
    
  Scenario: Change folder color
    Given I click on the add button
    And I click on the create folder button
    Then I provide a filename "HowRU2"
    When I click the create button
    Then a folder "HowRU2" is created
    And I click on the menu button
    And I click on the change color option
    When I click on a color
    And I click on apply button
    Then the folder color is changed
    
  Scenario: Create sub folder
    Given I click on the add button
    And I click on the create folder button
    Then I provide a filename "HowRU1"
    When I click the create button
    Then a folder "HowRU1" is created
    When I click on folder
    And I click on add button
    And I click on the create folder button
    Then I provide a filename "subfolder"
    When I click the create button
    Then a folder "subfolder" is created
    
  
  Scenario: Upload in sub folder
    Given I click on the add button
    And I click on the create folder button
    Then I provide a filename "HowRU1"
    When I click the create button
    Then a folder "HowRU1" is created
    When I click on folder
    And I click on add button
    And I click on the create folder button
    Then I provide a filename "subfolder"
    When I click the create button
    Then a folder "subfolder" is created
    When I click on folder
    And I click on the add button
    And I click on the upload button
    When I click on single image
    Then The image is uploaded to sub folder
    
  Scenario: Upload in sub folder
    Given I click on the add button
    And I click on the create folder button
    Then I provide a filename "HowRU1"
    When I click the create button
    Then a folder "HowRU1" is created
    When I click on folder
    And I click on add button
    And I click on the create folder button
    Then I provide a filename "subfolder"
    When I click the create button
    Then a folder "subfolder" is created
    When I click on folder
    And I click on the add button
    And I click on the upload button
    When I select multiple images
    Then The images are uploaded to digiboxx homepage