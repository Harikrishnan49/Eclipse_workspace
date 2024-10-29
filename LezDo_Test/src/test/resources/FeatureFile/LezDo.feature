#Author: harikrishnan15me048@gmail.com
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
Feature: API Automation check in Demo Pet Store URL

  @tag1
  Scenario: To implement the API checks get,post,update and delete
    Given I want to get the available pets in the store
    When I need to post a new pet as available in the store
    And I need to update the status of the pet as sold
    Then I need to delete that pet
    

