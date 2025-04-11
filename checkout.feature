Feature: Checkout product

  Scenario: User completes a purchase
    Given the user has a product in the cart
    When the user proceeds to checkout
    Then the checkout should complete successfully
