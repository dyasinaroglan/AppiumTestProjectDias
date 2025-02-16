Feature: Akakce

  Scenario: Adding a product to the cart scenario in Akakce application
    Given Click on the continue without becoming a member button.
    When Laptop is written in the Search Box input field. "Laptop"
    And Click on the Filter button and select Computer, Hardware
    And Click on the See Products button
    And The highest price option is selected from the sorting options.
    And Click on the tenth product from the listed products. "Casper Excalibur"
    And Click on the Go to Product button.
    Then Verify that the Go to Seller button is displayed on the product details screen.


