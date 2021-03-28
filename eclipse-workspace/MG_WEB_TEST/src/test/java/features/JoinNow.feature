#Author: chandu_2809@yahoo.com
Feature: feature to test Join now functionality
  I want to use this template for my feature file

  @tag1
  Scenario: Signup for MoneyGaming
    Given User on homePage
    When user click on Join Now button
    #And select a title "Mr" from dropdown
    #And enters firname "Chandra" and surname "Pasupuleti" in the form
    And signup with title "Mr" firstname "Chandra" surname "Pasupuleti"
    And click the tickbox to accept terms and conditions
    And sumbit the form by clikcing the JOIN NOW button
    Then Validation message 'This field is required' appears under the date of birth box