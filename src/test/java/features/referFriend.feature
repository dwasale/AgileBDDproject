Feature: User wants to refer a product to a friend

  @referAFriend
  Scenario Outline: As a registered user they should be able to refer a products to a friend

    When User click on register link button
    Then User should be able to register and go back to home page
    Then User click on "<category_name>" menu
    Then Goto "<sub_category_name>" menu
    Then Choose one of the "<products>" item
    Then User should be able to refer it to a friend

    Examples:
      | category_name | sub_category_name | products                  |
      | Computers     | Notebooks         | Apple MacBook Pro 13-inch |
