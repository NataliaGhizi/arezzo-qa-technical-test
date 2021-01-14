Feature: feature to test create a account and buy a product

  Scenario Outline: Validate create account and buy a product
    Given that the user hits Sign in
    And user enter with valid email <email>
    When second page load user enter with title <title>
    And user enter with first name <first-name>
    And user enter with last name <last-name>
    And user enter with password <password>
    And user enter with day of birth <date-birth-day>
    And user enter with month of birth <date-birth-month>
    And user enter with year of birth <date-birth-year>
    And user enter with company <company>
    And user enter with address <address>
    And user enter with second address <address2>
    And user enter with city <city>
    And user enter with state <state>
    And user enter with zip/postal code <postal-code>
    And user enter with country <country>
    And user enter with additional information <add-info>
    And user enter with home phone <home-phone>
    And user enter with mobile phone <mobile-phone>
    And user enter with Assign an address alias for future reference <other-address>
    Then user search for product <product>
    And user selects the first product of the search result
    And user hits Add to cart
    And user hits Proceed to checkout
    And in shipping step user must agree with the terms
    And in payment step user choose pay by check
    And user confirm his order

    Examples: 
      | email               | title | first-name | last-name | password | date-birth-day | date-birth-month | date-birth-year | company   | address                     | address2              | city       | state | postal-code | country | add-info | home-phone | mobile-phone | other-address | product |
      | te25stt@xpto.com.br | Mr.   | Joao       | Silva     |   123456 |              4 |                6 |            1990 | Datacorps | MANUEL GOMEZ DE CASTRO 4764 | BUROCRATAS DEL ESTADO | Nuevo Leon |     3 |       64380 |      21 | Test     | 9046419577 |   7146537772 | GONZALEZ 32   | dresses |
