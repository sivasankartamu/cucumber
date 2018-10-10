#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Test the bank application
  

  @tag1
  Scenario: Login with validate 
    Given Lauchbrowser
    When Login credit
    |mngr157083|mngr157083|
    And Click login    
    Then test is this correct
    

  @tag2
  Scenario Outline: Task to fill all vales
    Given Next url
    When Check fields
    |sivasankar|
    Then Done

    