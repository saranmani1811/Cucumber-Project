Feature: Verifying Adactin SelectHotel Page Details

  Scenario Outline: Verifying Adactin Select Hotel Page By Selecting Hotel
    Given User is on the login page
    When User should perform login"<userName>"and"<password>"
    Then User should verify welcome message "Hello Manikandan18!" after login
    And User should perform searching the hotel "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>"and"<childrensPerRoom>"
    Then User should verify the select hotel title "Select Hotel" after searching the hotel
    And User should perform continue to selecting the hotel
    Then User should verify the book hotel  title "Book A Hotel" in the book hotel page

    Examples: 
      | userName     | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom |
      | Manikandan18 | R260OS   | Sydney   | Hotel Creek | Standard | 1 - One   | 01-09-2022   | 02-09-2022   | 1 - One       | 1 - One          |

  Scenario Outline: Verifying  Adactin Select Hotel Page By Without Selecting Hotel
    Given User is on the login page
    When User should perform login"<userName>"and"<password>"
    Then User should verify welcome message "Hello Manikandan18!" after login
    And User should perform searching the hotel "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>"and"<childrensPerRoom>"
    Then User should verify the select hotel title "Select Hotel" after searching the hotel
    And User should perform continue to without selecting hotel
    Then User shuold verify the select hotel error message "Please Select a Hotel" in Select Hotel page

    Examples: 
      | userName     | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom |
      | Manikandan18 | R260OS   | Sydney   | Hotel Creek | Standard | 1 - One   | 01-09-2022   | 02-09-2022   | 1 - One       | 1 - One          |
