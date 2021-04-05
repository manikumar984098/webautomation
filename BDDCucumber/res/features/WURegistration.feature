Feature: WU Registration Validation

@Regression
  Scenario Outline: Registration Form Validation
    Given user launch the browser
    When user enters WU Registration URL
    Then User should land on WU Registration page
    And User enters first name in the first name field as <firstName>
    And User enters middle name in the middle name field as <middlName>
    And User enters last name in the last name field as <lastName>
    And user enters DOB in dob input filed as <dob>
    And User click on submit button on the bottom of the section

    Examples: 
      | firstName  | middlName | lastName | dob        |
      | Subramayam | Mani      | Gowda    | 10/09/1991 |

@Smoke
  Scenario Outline: Registration Form Validation for another user
    Given user launch the browser
    When user enters WU Registration URL
    Then User should land on WU Registration page
    And User enters first name in the first name field as <firstName>
    And User enters middle name in the middle name field as <middlName>
    And User enters last name in the last name field as <lastName>
    And user enters DOB in dob input filed as <dob>
    And User click on submit button on the bottom of the section

    Examples: 
      | firstName | middlName | lastName | dob        |
      | Dhanvitha | Malli     | Gowda    | 10/09/1990 |

