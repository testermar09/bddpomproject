Feature: To Check Hotelname Location Roomtype Total Day from Search hotel page
  
  Scenario: To Check Hotelname Location Roomtype in Select Hotel Page
  
    Given user is on LoginPage
    When user enters text in textbox in LoginPage
    |objectName|text|
    |usernameTextBox|reyaz0617|
    And user enters text in textbox in LoginPage
    |objectName|text|
    |passwordTextBox|reyaz123|
    When user clicks on button in LoginPage
    |objectName|
    |loginButton|
    Then user validates title to be "Adactin.com - Search Hotel"
    Given user is on SearchHotelPage
    When user enter details in SearchHotelPage
    |Location|Hotels     |Number of Rooms|Check In Date|Check Out Date|Adults per Room|
    |Sydney  |Hotel Creek|1 - One         |23/12/2022   |24/12/2022    |1 - One       |
    When user clicks on button in SearchHotelPage
    |objectName|
    |searchButton|

 
