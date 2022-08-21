Feature: Verifying Adactin CancelBooking Page Details

  Scenario Outline: Verifying Adactin Cancelling the booking with generated order id
    Given User is on the login page
    When User should perform login"<userName>"and"<password>"
    Then User should verify welcome message "Hello Manikandan18!" after login
    And User should perform searching the hotel "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>"and"<childrensPerRoom>"
    Then User should verify the select hotel title "Select Hotel" after searching the hotel
    And User should perform continue to selecting the hotel
    Then User should verify the book hotel  title "Book A Hotel" in the book hotel page
    And User should perform to booking the hotel by"<firstName>","<lastName>"and"<address>"
      | cardNo           | cardType         | expMonth  | expYear | cvvNum |
      | 1234567890123456 | American Express | September |    2022 |    123 |
      | 9876543219876543 | Master Card      | October   |    2022 |    456 |
      | 1234512345123451 | VISA             | November  |    2022 |    789 |
      | 1234512345123451 | Other            | December  |    2022 |    012 |
    Then User should verify the booking conformation message "Booking Confirmation" in booking conformation page
    And User should perform cancelling the booking with order id
    Then User should verify the "The booking has been cancelled." message in Booked Itinerary page

    Examples: 
      | userName     | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrensPerRoom | firstName  | lastName | address |
      | Manikandan18 | R260OS   | Sydney   | Hotel Creek | Standard | 2 - Two   | 01/09/2022  | 02/09/2022   | 2 - Two       | 2 - Two          | Manikandan | S        | Chennai |

  Scenario Outline: Verifying Adactin Cancelling the booking with cancel existing order id
    Given User is on the login page
    When User should perform login"<userName>"and"<password>"
    Then User should verify welcome message "Hello Manikandan18!" after login
    And User should cancel the existing order id "<Order Id>"
    Then User should verify the "The booking has been cancelled." message in Booked Itinerary page

    Examples: 
      | userName     | password | Order Id   |
      | Manikandan18 | R260OS   | 72R21ZW2N4 |
