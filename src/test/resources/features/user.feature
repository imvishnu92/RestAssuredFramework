Feature: User API

  Scenario Outline: Verify user API
    When I fetch user with id <id>
    Then response status should be <status>

    Examples:
      | id | status |
      | 1  | 200    |
      | 2  | 200    |

  Scenario Outline: Fetch invalid user
    When I fetch user with id <id>
    Then response status should be <status>
    Examples:
      | id | status |
      | 999| 404    |

#  Scenario: Create new user
#    When I create a new user
#    Then response status should be 201
