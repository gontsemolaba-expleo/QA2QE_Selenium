Feature: View Women Sale Items

  Scenario: User wants to view women sale items
    Given user is on the magento website
    When user wants to view women sale items
    Then women sale items must be displayed
    