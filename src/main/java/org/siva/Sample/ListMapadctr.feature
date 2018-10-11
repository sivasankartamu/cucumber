#Author: your.email@your.domain.com
#Keywords Summary :

#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: List to add new cutomer
    Given Lauch browser
    And login
    |mngr157083| uvUgupA|
    When Fill the form <name>and<dob>and<addr>and<city>and<state>and<pin>and<mob>and<email>
    |name|dob|addr|city|state|pin|mob|email|
    |siva|01/05/1994|3,car st,mubai|delhi|100001|987654323|siva@gmail.com|
    |vicky|12/25/1991|4,south st,agra|arunan|306001|98123323|vicky@gmail.com|
    |shaunmugam|08/14/1997|154,east car st,tirupathi|andra|800001|986284323|shanumuga@gmail.com|
    
    And Check the box
    
    Then Submit and reset
    And Present value
    

  
