Feature: Add product to cart

  Scenario: User adds a product to the cart
    Given the user is on the BStackDemo homepage
    When the user selects a product and adds it to the cart
    Then the product should be visible in the cart
