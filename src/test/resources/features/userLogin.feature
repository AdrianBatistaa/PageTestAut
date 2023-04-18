#Author: adfeli26@gmail.com

  #Language: En
@stories
Feature: as a user i want to login to swag labs

  Scenario: successful authentication
    Given the user is on the web page

    When the user enters his username and password

      |username       | password    |
      |standard_user  | secret_sauce|

    Then the user will be able to see products

      |firstname      | lastname    | postalcode |
      |Adrian         | Batista     |   546551   |