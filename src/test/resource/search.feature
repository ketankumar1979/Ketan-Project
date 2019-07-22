Feature: search
  @smoke
  Scenario: search the product
    Given user is on home page
    When user search for a product " "
    Then urse can see respective products
    @regression
    Scenario Outline: search for multiple products
      Given user is on home page
      When user search for a  "<product>"
      Then user can see all products of respective search
      Examples:
      |product|
      |nike   |
      |puma   |