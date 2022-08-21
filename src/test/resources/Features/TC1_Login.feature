Feature: Verifying Adactin Login Page Details

  Scenario Outline: Verifying Adactin login with valid data
    Given User is on the login page
    When User should perform login"<userName>"and"<password>"
    Then User should verify welcome message "Hello Manikandan18!" after login

    Examples: 
      | userName     | password |
      | Manikandan18 | R260OS   |

  Scenario Outline: Verifying Adactin login with valid data using ENTER key
    Given User is on the login page
    When User should perform login "<userName>"and"<password>" using ENTER key
    Then User should verify welcome message "Hello Manikandan18!" after login

    Examples: 
      | userName     | password |
      | Manikandan18 | R260OS   |

  Scenario Outline: Verifying Adactin login with Invalid data
    Given User is on the login page
    When User should perform login"<userName>"and"<password>"
    Then User should verify  invalid data error message  "Invalid Login details or Your Password might have expired. Click here to reset your password" after login

    Examples: 
      | userName | password |
      | abcd     | R260OS   |
