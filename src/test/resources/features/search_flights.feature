# author: Julian Esteban Polanco Sogamoso
# language: en

@stories
Feature: Buy flights
  As a user of Avianca I want to buy a flight so that I can travel to my destination

  @BuyFlightsSuccess
  Scenario Outline: Buy flights success
    Given Than I am on the main page of Avianca
    When I select all the information of the flight
      | from   | destination   | departureDate   | returnDate   | adults   | children   |
      | <from> | <destination> | <departureDate> | <returnDate> | <adults> | <children> |
    Then I should see the flight information
    Examples:
      | from     | destination | departureDate | returnDate | adults | children |
      | Medellín | Toronto     | 2022-25-10    | 2022-31-10 | 2      | 2        |



