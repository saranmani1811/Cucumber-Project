Feature: Verifying Adactin BookingHotel page

  Scenario Outline: Verifying Adactin BookHotel page with entering all fields
    Given User is on the login page
    When User should perform login"<userName>"and"<password>"
    Then User should verify welcome message "Hello Manikandan18!" after login
    And User should perform searching the hotel "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>"and"<childrensPerRoom>"
    Then User should verify the select hotel title "Select Hotel" after searching the hotel
    And User should perform continue to selecting the hotel
    Then User should verify the book hotel  title "Book A Hotel" in the book hotel page
    And User should perform to booking the hotel by"<firstName>","<lastName>"and"<address>"
      | cardNo           | cardType         | expMonth  | expYear | cvvNum |
      | 1234567890123456 | American Express | September |    2022 |   1234 |
      | 9876543219876543 | Master Card      | October   |    2022 |   4567 |
      | 1234512345123451 | VISA             | November  |    2022 |   7890 |
      | 1234512345123451 | Other            | December  |    2022 |   0123 |
    Then User should verify the booking conformation message "Booking Confirmation" in booking conformation page

    Examples: 
      | userName     | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom | firstName  | lastName | address |
      | Manikandan18 | R260OS   | Sydney   | Hotel Creek | Standard | 2 - Two   | 01/09/2022  | 05/09/2022   | 2 - Two       | 2 - Two          | Manikandan | S        | Chennai |

  Scenario Outline: Verifying Adactin Book Hotel page without entering any fields
    Given User is on the login page
    When User should perform login"<userName>"and"<password>"
    Then User should verify welcome message "Hello Manikandan18!" after login
    And User should perform searching the hotel "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>"and"<childrensPerRoom>"
    Then User should verify the select hotel title "Select Hotel" after searching the hotel
    And User should perform continue to selecting the hotel
    Then User should verify the book hotel  title "Book A Hotel" in the book hotel page
    And User should perform to booking the hotel without enter any fields
    Then User should verify the all error message "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month"and"Please Enter your Credit Card CVV Number" in book a hotel page

    Examples: 
      | userName     | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom |
      | Manikandan18 | R260OS   | Sydney   | Hotel Creek | Standard | 1 - One   | 01-09-2022  | 02-09-2022   | 1 - One       | 1 - One          |
