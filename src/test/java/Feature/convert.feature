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

Feature: To test currency converter
  
  Scenario Outline:  Test the currency conversion
    Given user navigates to url
    When user enters the "<Amount>" and enters "<From>" , "<To>" and  press convert
    Then usr verifies the value

   Examples:
   |Amount|From|To|
   |2.00|Euro|Can|
   |3.00|Can|Euro|
   |5.00|USD|Euro| 