Feature: Login to the Orange HRM
 Scenario Outline: Login with datatable values with Example
    Given when user go to the website
    When I give the data "<UserName>" and "<Password>"
    Then user click the login button

Examples:
| UserName | Password |
| Admin    | admin123 |
| admin    | Admin123 |