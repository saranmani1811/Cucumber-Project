Feature: Verifying Adactin SearchHotel Page Details

  Scenario Outline: Verifying Adactin SearchHotel By Enters All Fields
    Given User is on the login page
    When User should perform login"<userName>"and"<password>"
    Then User should verify welcome message "Hello Manikandan18!" after login
    And User should perform searching the hotel "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>"and"<childrensPerRoom>"
    Then User should verify the select hotel title "Select Hotel" after searching the hotel

    Examples: 
      | userName     | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom |
      | Manikandan18 | R260OS   | Sydney   | Hotel Creek | Standard | 1 - One   | 01-09-2022  | 02-09-2022   | 1 - One       | 1 - One          |

  Scenario Outline: Verifying Adactin SearchHotel By Enters Only Mandatory Fields
    Given User is on the login page
    When User should perform login"<userName>"and"<password>"
    Then User should verify welcome message "Hello Manikandan18!" after login
    And User should perform mandatory fields by searching the hotel "<location>","<noOfRooms>","<checkInDate>","<checkOutDate>"and"<adultsPerRoom>"
    Then User should verify the select hotel title "Select Hotel" after searching the hotel

    Examples: 
      | userName     | password | location | noOfRooms | checkInDate | checkOutDate | adultsPerRoom |
      | Manikandan18 | R260OS   | Sydney   | 1 - One   | 01-09-2022  | 02-09-2022   | 1 - One       |

  Scenario Outline: Verifying Adactin SearchHotel with Invalid DateCheckIn and DateCheckOut
    Given User is on the login page
    When User should perform login"<userName>"and"<password>"
    Then User should verify welcome message "Hello Manikandan18!" after login
    And User should perform searching the hotel "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>"and"<childrensPerRoom>"
    Then User should verify date error message "Check-In Date shall be before than Check-Out Date" and "Check-Out Date shall be after than Check-In Date" in the search hotel page

    Examples: 
      | userName     | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom |
      | Manikandan18 | R260OS   | Sydney   | Hotel Creek | Standard | 1 - One   | 13-08-2022  | 10-08-2022   | 1 - One       | 1 - One          |

  Scenario Outline: Verifying Adactin SearchHotel Without Enter Any Fields
    Given User is on the login page
    When User should perform login"<userName>"and"<password>"
    Then User should verify welcome message "Hello Manikandan18!" after login
    And User should perform searching the hotel without entering any fields on the search hotel page
    Then User should verify location error message "Please Select a Location" in the search hotel page

    Examples: 
      | userName     | password |
      | Manikandan18 | R260OS   |
