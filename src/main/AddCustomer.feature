#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

@tag
Feature: Add new customer
  I want to use this template for my feature file

  @tag1
  Scenario: Fill customer details
    Given I want to lanunch application
    And check title of the application
    When Fill the details
    And check box
    And submit cutomer details
    Then customer validate
    And cutomer detail execute

  
