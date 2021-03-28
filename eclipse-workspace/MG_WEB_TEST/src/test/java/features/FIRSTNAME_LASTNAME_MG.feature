#Author: chandu_2809@yahoo.co.uk

Feature: password entry criteria

 
  Scenario Outline: test password field with Valid values
    Given New User is on sugn up page
    When an user enters password <Passwordvalue>
    And fill the rest of the form with valid values
    And click on terms and conditions
    And click on Join now button
    Then User should successfully register to money gaming.

    Examples: 
      | Passwordvalue  | 
      | 1Chan!ra       | 
      | Cha29.         |
      |c123%R          |
      |*chan9          |
      |.?Cha2          |
      |cH$$**          |
      |cH12@.7         |
      |cH12#0          |
      |P@s$+/          |
      |C^12}}7         |
      |cH1]=[.7        |
      
  Scenario Outline: test password field with invalid values
    Given New User is on sugn up page
    When an user enters password <InvalidPasswordvalue>
    And fill the rest of the form with valid values
    And click on terms and conditions
    And click on Join now button
    Then User should get validation message with "password should be atleast 1 capital and 1 special character and 6 in length".

    Examples: 
      | InvalidPasswordvalue  | 
      | 1Chanra               | 
      | cha29.                |
      |c123dR                 |
      |*cH9n                  |
      | C@1                   |
      |                       |
      | 123456                |
      |CHAND12345             |    
       
