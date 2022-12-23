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

 
