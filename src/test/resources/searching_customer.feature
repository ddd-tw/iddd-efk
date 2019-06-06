Feature: Searching customer
  As a project manager I want to search customer

  Scenario: Searing for a existing customer
    Given there is a customer named "Bob"
    When I search a customer name "Bob"
    Then I get a customer with name "Bob"

  Scenario: Searing for a customer is not exist in system
    When I search a customer name "Eric"
    Then customer is not presented