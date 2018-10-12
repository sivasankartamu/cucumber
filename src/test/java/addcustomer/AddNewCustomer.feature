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
Feature: Add new customer in guru bank
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario
    Given The user login to the guru login
    |mngr157083| uvUgupA|
    And The user navigate add customer page
    When The user add the customer detatail "<name>","<gender>","<dob>","<address>","<city>","<state>","<pin>","<mob>"and"<email>"
    And The user submit and reset on the page
    Then The user validate details
    And The user generate the reports

 
    Examples: 
      | name  | gender| dob        | address                              |  city  |  state | pin   |  mob          | email          | 
      | Sakthi| male  | 01/12/1994 |123,West car street,anthaman          | Delhi  | Andra  |300989 | 9087321213    |sakthi@gmail.com |
      #| nagash| male  | 11/11/1995 |54,North car street,anthaman          | Delhi  | Kerala |500959 | 9080921213    |nagesh@gmail.com |
